package com.uap.popquizset1.transactionapi.dto;

import java.util.List;

public class TransactionRequest {
    private String customerName;
    private String customerAddress;
    private List<TransactionItemRequest> items;

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

    public List<TransactionItemRequest> getItems() {
        return items;
    }

    public void setItems(List<TransactionItemRequest> items) {
        this.items = items;
    }
}