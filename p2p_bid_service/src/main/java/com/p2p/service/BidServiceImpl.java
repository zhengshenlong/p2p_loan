package com.p2p.service;

import com.p2p.bean.Bid;
import com.p2p.bean.Vo.BidVo;
import com.p2p.dao.BidDao;
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
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class BidServiceImpl implements  BidService{


    @Autowired
    private BidDao bidDao;

    @Override
    public Page<Bid> selectAll(BidVo bidVo) {
          //多条件查询语句
        Specification<Bid> spec= new Specification<Bid>() {
            @Override
            public Predicate toPredicate(Root root, CriteriaQuery criteriaQuery, CriteriaBuilder cb) {
                 //new 一个数组 方便使用
                List<Predicate> list = new ArrayList<>();
                 //开始判断投资的时间
                if(bidVo.getStartDate()!=null){
                    //如果不为空就添加到集合中
                    Predicate s1 = cb.greaterThanOrEqualTo(root.get("bidTime"), bidVo.getStartDate());
                   list.add(s1);
                }

                if(bidVo.getEndDate()!=null){
                    //如果不为空就添加到集合中
                    Predicate s2 = cb.lessThanOrEqualTo(root.get("bidTime"), bidVo.getEndDate());
                    list.add(s2);
                }
                Predicate[] arr=list.toArray(new Predicate[list.size()]);
                return cb.and(arr);
            }
        };
        //调用jpa的查询方法和分页方法实现列表展示
        return bidDao.findAll(spec,PageRequest.of(bidVo.getPageNum()-1,bidVo.getPageSize()));
    }
}
