package com.coupon.Controller;

import com.coupon.model.Coupon;
import com.coupon.Service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/couponshow")
public class CouponController {
@Autowired
    CouponService service;
    @GetMapping("/coupon")
    public String coupon(){
        return service.coupon();
    }

    @GetMapping("/getallcoupon")
    public List<String> getAllCoupon(){
        int quantity=10;
        List<String> allcoupon=service.getCoupon(10);
        return allcoupon;
    }

    @GetMapping("/jsoncoupon")
    public Coupon getDummyJson(){
     Coupon coupon =Coupon.builder().id(service.coupon()).validFor(3).type("vouchar").build();
     return coupon;
    }

    @GetMapping("/all-coupon")// url middle portion provide underscore
    public List<String> getCoupon(){
        return service.getCoupon(10);
    }

    @GetMapping("/coupon-id/{id}")
    public String getById(@PathVariable("id") String id){
         return id +"_"+service.coupon();
    }


    //  Get Coupons with Filter (Query Parameter)
    @GetMapping("/search_coupon")
    public String searchCoupon(@RequestParam("valid") boolean isvalid,@RequestParam(value = "type",required = false) String couponType,
                               @RequestParam("category") String category){
        return "quary parameter valid="+ isvalid+ "Coupon Type="+couponType+ "Coupon category="+category;
    }

    //get coupon data of object oriented
    @GetMapping("/generate/new")
    public Coupon generateNewCoupon(){
        Coupon c =service.generateCoupon();
        return c;
    }

}
