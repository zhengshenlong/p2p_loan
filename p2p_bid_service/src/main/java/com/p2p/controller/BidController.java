package com.p2p.controller;

import com.p2p.bean.Bid;
import com.p2p.bean.Vo.BidVo;
import com.p2p.service.BidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/bid/")
@CrossOrigin(allowCredentials = "true")
@RestController
public class BidController {

    @Autowired
    private BidService bidService;

    @GetMapping("list")
    public Page<Bid> zhan(BidVo bidVo){
        return bidService.selectAll(bidVo);
    }

}
