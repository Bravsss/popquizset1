package com.uap.popquizset1.transactionapi.dto;

import java.math.BigDecimal;
import java.util.List;

public class TransactionDetailsResponse {
    private String customerName;
    private String customerAddress;
    private List<TransactionItemResponse> items;
    private BigDecimal totalAmountDue;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public List<TransactionItemResponse> getItems() {
        return items;
    }

    public void setItems(List<TransactionItemResponse> items) {
        this.items = items;
    }

    public BigDecimal getTotalAmountDue() {
        return totalAmountDue;
    }

    public void setTotalAmountDue(BigDecimal totalAmountDue) {
        this.totalAmountDue = totalAmountDue;
    }
}