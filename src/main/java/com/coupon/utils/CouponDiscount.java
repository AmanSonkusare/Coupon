package com.coupon.utils;

import java.util.Random;

public class CouponDiscount {
    private static String[] couponDiscount={
           "Get a percentage off the total purchase amount",
     "Receive a fixed monetary discount on your order.",
   "Enjoy free shipping for your purchase.",
     "Buy one product and get another one for free.",
    "Additional discounts on clearance or sale items.",
     "New customers get a special discount on their first order.",
     "Special discounts tied to specific holidays or seasons.",
      "Refer a friend and both of you get a discount.",
"Loyal customers receive discounts based on their purchase history.",
     "Save when you purchase a bundle or package of products."
    };

    public static String getCouponDiscount(){
        Random random =new Random();
        int randomIndex=random.nextInt(couponDiscount.length);
        String t= couponDiscount[randomIndex];
        return t;
    }

    public static void main(String[] args) {
        String s=CouponDiscount.getCouponDiscount();
        System.out.println(s);
    }
}
