package com.p2p.dao;


import com.p2p.bean.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer>{

     //登录
    public  User findByUserUsername(String  userUsername);
}
