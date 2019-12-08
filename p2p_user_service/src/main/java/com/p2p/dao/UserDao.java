package com.p2p.dao;


import com.p2p.bean.User;
import io.lettuce.core.dynamic.annotation.Param;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface UserDao {

     //登录
     @Select("select * from t_user where user_username=#{userUsername}")
     User findByUserUsername(@Param("userUsername") String userUsername);

}
