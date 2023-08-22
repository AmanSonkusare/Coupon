package com.voucher.Controller;

import com.voucher.model.Voucher;
import com.voucher.service.VoucherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/getvoucher")
public class VoucherController {
    @Autowired
    VoucherService service;
    @GetMapping("/newvoucher")
    public String newVoucher(){
 String voucher=service.voucher();
 return voucher;
    }

    @GetMapping("voucher/new")
    public Voucher gernerateNewVoucher(){
        Voucher v=service.gernerateNewVoucher();
   return v;
    }

}
