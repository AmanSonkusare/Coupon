package com.coupon.Service;

import com.coupon.model.Coupon;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@Component
public class CouponService {

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

    public Coupon generateCoupon() {
        Coupon c = Coupon.builder()
                .id(UUID.randomUUID().toString())
                .validFor(5 + new Random().nextInt(90))
                .type("menwear")
                .build();
        return c;
    }
}
