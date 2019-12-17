package com.p2p.controller;

import com.p2p.service.AccountFlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(allowCredentials = "true")
@RequestMapping("accountFlow")
public class AccountFlowController {


    @Autowired
    private AccountFlowService accountFlowService;


}
