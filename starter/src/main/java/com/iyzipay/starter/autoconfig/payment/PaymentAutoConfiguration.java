package com.iyzipay.starter.autoconfig.payment;

import com.iyzipay.sample.payment.repository.PaymentRepository;
import com.iyzipay.sample.payment.service.PaymentService;
import com.iyzipay.sample.payment.service.impl.PaymentServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.transaction.Transactional;

/**
 * Created by cenkakin
 */
@ConditionalOnClass(PaymentService.class)
@Configuration
public class PaymentAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(PaymentService.class)
    @Transactional
    public PaymentServiceImpl paymentService(PaymentRepository paymentRepository) {
        return new PaymentServiceImpl(paymentRepository);
    }

}
