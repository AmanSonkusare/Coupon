package com.coupon.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
@Entity
public class Coupon {
    @Id
    @GeneratedValue
    private int id;
    private String title;
    @Column(name="coupon_type")
    private String type;
    private String description;
    @Column(name="coupon_code")
    private String couponcode;
    @Column(name="validity_Date")
    private Date validityDate;
    private int discount;
    private String category;
    @Column(name="creat_date")
    private Date creatDate;
    private String createdby;
    private Boolean isActive;
    private String status;
}
