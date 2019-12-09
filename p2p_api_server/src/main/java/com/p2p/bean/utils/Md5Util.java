package com.p2p.bean.utils;


import org.apache.commons.codec.digest.DigestUtils;

//对称加密
//非对象加密
//单向加密 md5
public class Md5Util {

      /*
      * 进行md5加密
      *  src  明文
      *   return 密文
      * */
        public static  String md5(String  src){

           return DigestUtils.md5Hex(src);

        }


}
