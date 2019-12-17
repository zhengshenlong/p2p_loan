package com.p2p.service.impl;

import com.p2p.service.AccountFlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class AccountFlowServiceImpl implements AccountFlowService {
    @Autowired
    private AccountFlowService accountFlowService;
}
