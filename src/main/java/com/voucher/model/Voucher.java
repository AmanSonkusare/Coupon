package com.voucher.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
@Table(name="app_voucher")
public class Voucher {
    @Id
    @GeneratedValue
private int id;
    @Column(name="valid_for")
private int validFor;
    @Column(name="title")
private String title;
    @Column(name="category")
private String category;
    @Column(name="discount")
private  int discount;
}
