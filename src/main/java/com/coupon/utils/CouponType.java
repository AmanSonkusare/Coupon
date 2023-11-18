package com.coupon.utils;

import java.util.Random;

public class CouponType {
    private static String[] coupontype={"Percentage Discount",
            "Fixed Amount",
            "Free Shipping",
            "BOGO",
            "Clearance",
            "First-Time Customer",
            "Holiday/Seasonal",
            "Referral",
            "Loyalty Program",
            "Bundle/Package Deal"};

    public static String getCouponType(){
        Random random =new Random();
        int randomIndex=random.nextInt(coupontype.length);
        String t= coupontype[randomIndex];
        return t;
    }

    public static void main(String[] args) {
        String s=CouponType.getCouponType();
        System.out.println(s);
    }
}
