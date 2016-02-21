package com.iyzipay.sample.payment.vo;

import java.math.BigDecimal;

/**
 * Created by cenkakin
 */
public class PaymentVo {

    private long userId;
    private BigDecimal amount;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
