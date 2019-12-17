package com.p2p.feign;

import com.p2p.bean.Account;
import com.p2p.bean.Borrow;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "p2p-account-service")
public interface LoanAuditFeign {

    @GetMapping("account/selectAccount")
    public Account getAccount(Integer id);

}
