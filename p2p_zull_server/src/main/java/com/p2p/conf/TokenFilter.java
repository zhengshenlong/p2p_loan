package com.p2p.conf;

import com.p2p.util.CookieUtil;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@Component
public class TokenFilter extends ZuulFilter {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        RequestContext currentContext = RequestContext.getCurrentContext();
        //2.获取Request对象
        HttpServletRequest request = currentContext.getRequest();

        if (request.getRequestURI().contains("/login")) {
            return false;
        }
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        //案例：拦截所有的服务接口，判断服务接口上是否有传递userToken参数。
        //1.获取上下文
        RequestContext currentContext = RequestContext.getCurrentContext();
        //2.获取Request对象
        HttpServletRequest request = currentContext.getRequest();
        Cookie newCookie = null;
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals(CookieUtil.COOKIE_TOKEN_NAME)) {
                    newCookie = cookie;
                    break;
                }
            }
        }

        if (newCookie == null || !redisTemplate.hasKey(newCookie.getValue())) {
            currentContext.setSendZuulResponse(false);//拦截
            currentContext.setResponseStatusCode(HttpStatus.FORBIDDEN.value());
            return null;
        }
        System.out.println("true");
        return null;
    }
}
