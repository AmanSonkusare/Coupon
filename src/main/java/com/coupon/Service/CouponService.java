package com.coupon.Service;

import com.coupon.Repositary.CouponRepositary;

import com.coupon.model.Coupon;
import com.coupon.utils.CouponTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;


@Service
public class CouponService {

    @Autowired
    CouponRepositary couponRepositary;
    public String coupon() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();// any object convert into string that time  we use tostring method.
    }

    public List<String> getCoupon(int quantity) {
        List<String> coupon = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            String c = coupon();
            coupon.add(c);
        }
        return coupon;
    }

//    public Coupon generateCoupon() {
//        Coupon c = Coupon.builder()
//                .id(UUID.randomUUID().toString())
//                .validFor(5 + new Random().nextInt(90))
//                .type("menwear")
//                .build();
//        return c;
//    }

   public List<Coupon> randomDataStore(int randomData){
        List<Coupon> list=new ArrayList<>();
        for (int i=0;i<randomData;i++) {
            Coupon coupon = Coupon.builder().title(CouponTitle.getTitle()).build();
            list.add(coupon);

        }
         return couponRepositary.saveAll(list);
    }
}
