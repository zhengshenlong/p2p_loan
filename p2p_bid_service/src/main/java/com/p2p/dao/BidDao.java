package com.p2p.dao;

import com.p2p.bean.Bid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BidDao extends JpaRepository<Bid,Integer>, JpaSpecificationExecutor<Bid> {

}
