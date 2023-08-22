package com.coupon;

import com.coupon.Service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CouponApp implements ApplicationRunner {
    public static void main(String[] args) {
        SpringApplication.run(CouponApp.class,args);
    }

    @Autowired
    CouponService couponService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("I am present in coupon class");
      String coupon =  couponService.coupon();
        System.out.println("print the coupon="+coupon);

    }
}
