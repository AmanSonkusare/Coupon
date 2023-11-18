package com.coupon.utils;

import java.util.Random;

public class CouponTitle {

    private static String[] title={"SAVE20",
            "FREESHIP",
            "SUMMERSALE",
            "BIGSAVINGS",
            "FLASHDEAL"};

    public static String getTitle(){
       Random random =new Random();
       int randomIndex=random.nextInt(title.length);
      String t= title[randomIndex];
      return t;
    }

    public static void main(String[] args) {
        String s=CouponTitle.getTitle();
        System.out.println(s);
    }
}
