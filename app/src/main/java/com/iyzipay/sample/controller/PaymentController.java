package com.iyzipay.sample.controller;

import com.iyzipay.sample.payment.domain.Payment;
import com.iyzipay.sample.payment.service.impl.PaymentServiceImpl;
import com.iyzipay.sample.payment.vo.PaymentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cenkakin
 */
@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    PaymentServiceImpl paymentService;

    @RequestMapping(value = "/payment", method = RequestMethod.POST)
    public ResponseEntity<Payment> executePayment(@RequestBody PaymentVo paymentVo) {
        return ResponseEntity.ok(paymentService.createPayment(paymentVo));
    }

}
