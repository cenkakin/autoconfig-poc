package com.iyzipay.sample.payment.repository;

import com.iyzipay.sample.payment.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by cenkakin
 */
public interface PaymentRepository extends JpaRepository<Payment, Long> {

    Payment findByIdAndUserId(Long id, Long userId);

}
