package com.p2p.bean.utils;

public interface LoanConst {

    //public static final
    //还款方式
    public static final int RETURN_TYPE_MONTH_AMOUNT = 0;//等额本息
    public static final int RETURN_TYPE_MONTH_INTEREST = 1;//按月到期
    public static final int RETURN_TYPE_MONTH_PRINCIPAL = 2;//等额本金

    //精度
    public static final int SCALE_DISPLAY = 2;//显示精度
    public static final int SCALE_STORE = 4;//存储精度
    public static final int SCALE_COMPUTE = 8;//计算精度


}
