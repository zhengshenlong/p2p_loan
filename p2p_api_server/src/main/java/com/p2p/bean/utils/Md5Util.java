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

    public static void main(String[] args) {
        String pwd="123456";
        System.out.println(Md5Util.md5(pwd));
    }
}
