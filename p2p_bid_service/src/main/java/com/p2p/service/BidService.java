package com.p2p.service;

import com.p2p.bean.Bid;
import com.p2p.bean.Vo.BidVo;
import org.springframework.data.domain.Page;

public interface BidService {

     //列表展示功能
    Page<Bid> selectAll(BidVo bidVo);

}
