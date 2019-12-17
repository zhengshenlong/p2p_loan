package com.p2p.feign;

import com.p2p.bean.Account;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

//服务的方法的调用
@FeignClient(name = "p2p-account-service")
public interface AccountFeign {

    @RequestMapping("/account/addAccount")
    public void addAccount(@RequestBody Account account);

}
