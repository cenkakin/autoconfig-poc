package com.iyzipay.sample.payment.service;

import com.iyzipay.sample.payment.domain.Payment;
import com.iyzipay.sample.payment.vo.PaymentVo;

import java.util.Optional;

/**
 * Created by cenkakin
 */
public interface PaymentService {

    Optional<Payment> getPaymentByIdForUser(Long id, Long userId);

    Payment createPayment(PaymentVo payment);

}

