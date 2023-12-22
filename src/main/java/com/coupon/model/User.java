package com.coupon.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="app_user")
public class User {
    @Id
    @GeneratedValue
    private int  id;
    @Column(name="fname")
    private String name;
    @Column(name="address")
    private String address;
    @Column (name="phone_number")
    private long phoneNumber ;

}
