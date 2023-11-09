package com.uap.popquizset1.transactionapi.dto;

import java.math.BigDecimal;

public class TransactionResponse {
    private Long transactionId;
    private BigDecimal totalAmountDue;

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public BigDecimal getTotalAmountDue() {
        return totalAmountDue;
    }

    public void setTotalAmountDue(BigDecimal totalAmountDue) {
        this.totalAmountDue = totalAmountDue;
    }
}