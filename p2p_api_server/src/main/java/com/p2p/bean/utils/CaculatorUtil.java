package com.p2p.bean.utils;


import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 计算器工具类
 */
public class CaculatorUtil {
    /**
     * 计算借款标某一期的还款额度
     * @param borrowAmount 借款金额
     * @param yearRate 年化利率
     * @param returnMonthNum 还款期数
     * @param returnType 还款方式  0:等额本息   1:按月到期    2:等额本金
     * @param monethIndex 第几期
     * @return
     */
    public static BigDecimal caculateMonthAmount(
            BigDecimal borrowAmount
            ,BigDecimal yearRate
            ,int returnMonthNum
            ,int returnType
            ,int monethIndex) {

        return null;
    }

    /**
     * 计算借款标的总利息
     * @param borrowAmount 借款金额
     * @param yearRate 年化利率
     * @param returnMonthNum 还款期数
     * @param returnType 还款方式  0:等额本息   1:按月到期    2:等额本金
     * @return 借款标的总利息
     */
    public static BigDecimal caculateTotalInterest(
            BigDecimal borrowAmount
            ,BigDecimal yearRate
            ,int returnMonthNum
            ,int returnType){
       BigDecimal totalInterest = BigDecimal.ZERO;

        //计算月利率
       BigDecimal monthRate = yearRate.divide(new BigDecimal(100))
               .divide(new BigDecimal(12),LoanConst.SCALE_COMPUTE, RoundingMode.HALF_UP);

       switch (returnType){

           case LoanConst.RETURN_TYPE_MONTH_AMOUNT://等额本息

               //等额本息还款
               BigDecimal tmp1 = borrowAmount.multiply(monthRate);
               BigDecimal tmp2 = monthRate.add(BigDecimal.ONE).pow(returnMonthNum);
               BigDecimal tmp3 = tmp2.subtract(BigDecimal.ONE);
               //每月还款额 = 月利息 * 总金额率 / 总利率
               BigDecimal monthAmount = tmp1.multiply(tmp2).divide(tmp3,LoanConst.SCALE_COMPUTE, RoundingMode.HALF_UP);
               //总利息  = 每月还款额 * 还款期数  - 借款额度
               totalInterest = monthAmount.multiply(new BigDecimal(returnMonthNum)).subtract(borrowAmount);
               break;
           case LoanConst.RETURN_TYPE_MONTH_INTEREST://按月到期
               BigDecimal monthInterest = borrowAmount.multiply(monthRate);//月利息
               totalInterest = monthInterest.multiply(new BigDecimal(returnMonthNum))
                    .setScale(LoanConst.SCALE_STORE);//月利息*还款期数
               break;
           case LoanConst.RETURN_TYPE_MONTH_PRINCIPAL://等额本金·
               //等额本金还款
               totalInterest = new BigDecimal(returnMonthNum+1).multiply(borrowAmount)
                       .multiply(monthRate).divide(new BigDecimal(2))
                       .setScale(LoanConst.SCALE_STORE);

           break;
       }

        return totalInterest;
    }



}
