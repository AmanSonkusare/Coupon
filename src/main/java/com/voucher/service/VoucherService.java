package com.voucher.service;

import com.voucher.model.Voucher;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;
@Service
public class VoucherService {
    public String voucher(){
        UUID uuid=UUID.randomUUID();
        return uuid.toString();// any object convert into string that time  we use tostring method.
    }

 public Voucher gernerateNewVoucher(){
    Voucher voucher =Voucher.builder()
             .id(UUID.randomUUID().toString())
             .validFor(5+new Random().nextInt(90))
             .title("amazon")
             .category("menwear")
             .discount(10)
             .build();
        return voucher;
 }
}
