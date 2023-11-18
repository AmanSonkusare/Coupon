package com.voucher.Repositary;

import com.voucher.model.Voucher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoucherRepositary extends JpaRepository<Voucher,String> {
}
