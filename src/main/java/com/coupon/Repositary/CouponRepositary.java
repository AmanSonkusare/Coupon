package com.coupon.Repositary;

import com.coupon.model.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CouponRepositary extends JpaRepository<Coupon,Integer> {
}
