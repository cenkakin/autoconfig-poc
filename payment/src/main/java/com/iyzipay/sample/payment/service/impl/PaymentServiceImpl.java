package com.iyzipay.sample.payment.service.impl;

import com.iyzipay.sample.payment.domain.Payment;
import com.iyzipay.sample.payment.repository.PaymentRepository;
import com.iyzipay.sample.payment.service.PaymentService;
import com.iyzipay.sample.payment.vo.PaymentVo;

import java.util.Optional;

/**
 * Created by cenkakin
 */
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepository paymentRepository;

    public PaymentServiceImpl(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Override
    public Optional<Payment> getPaymentByIdForUser(Long id, Long userId) {
        return Optional.ofNullable(paymentRepository.findByIdAndUserId(id, userId));
    }

    @Override
    public Payment createPayment(PaymentVo paymentVo) {
        Payment payment = new Payment();
        payment.setAmount(paymentVo.getAmount());
        payment.setUserId(paymentVo.getUserId());
        return paymentRepository.save(payment);
    }
}
