package com.p2p.service;

import com.p2p.bean.Borrow;
import com.p2p.bean.Loan;
import com.p2p.bean.Vo.LoanVo;
import com.p2p.dao.LoanAuditDao;
import com.p2p.dao.LoanDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class LoanServiceImpl implements LoanService {

    @Autowired
    private LoanDao loanDao;

    @Autowired
    private LoanAuditDao loanAuditDao;


    @Override
    public Page<Loan> selectAll(LoanVo loanVo) {
        //进行分页展示数据
        Specification<Loan> spec = new Specification<Loan>() {
            @Override
            public Predicate toPredicate(Root<Loan> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder cb) {
                   //new一个数组 方便使用
                List<Predicate> list = new ArrayList<>();
                //进行多条件查询的判断
                if(loanVo.getStartDate()!=null){
                    //如果条件为空就不进行添加，如果不为空就添加
                    Predicate s1 = cb.greaterThanOrEqualTo(root.get("publishTime"), loanVo.getStartDate());
                      list.add(s1);
                }
                if(loanVo.getEndDate()!=null){
                    //如果条件为空就不进行添加，如果不为空就添加
                    Predicate s2 = cb.lessThanOrEqualTo(root.get("publishTime"), loanVo.getEndDate());
                    list.add(s2);
                }
                if(loanVo.getStatus()!=null&&!loanVo.getStatus().equals("")){
                    //如果条件为空就不进行添加，如果不为空就添加
                    Predicate s3 = cb.equal(root.get("status"), loanVo.getStatus());
                    list.add(s3);
                }
                 Predicate[] arr=list.toArray(new Predicate[list.size()]);
                return cb.and(arr);
            }
        };
        return loanDao.findAll(spec, PageRequest.of(loanVo.getPageNum()-1,loanVo.getPageSize()));
    }

    @Override
    public boolean save(Loan loan) {
        try {
            loanDao.save(loan);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Loan> findByStatusIs(Integer status) {
        return loanDao.findByStatusIs(0);
    }

    @Override
    public boolean updateStatus(Borrow borrow) {
        //通过审核id获取借款状态信息
        Loan loan = loanDao.findByBorrowSignId(borrow.getId());
         loan.setStatus(1);//把状态修改为1
        if(loanDao.save(loan)!=null){
            //判断如果借款信息不为空
            loanAuditDao.save(borrow);//添加审核记录表中
            return  true;
        }
        return false;
    }

    @Override
    public Loan getLoanById(Integer borrowSignId) {
        Optional<Loan> byId = loanDao.findById(borrowSignId);
        //判断借款标id是否存在
        if(byId.isPresent()){
            //如果存在获取id
            return byId.get();
        }
        //如果不存在则返回 null
        return null;
    }

}
