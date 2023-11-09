package com.uap.popquizset1.transactionapi.service;

import com.uap.popquizset1.transactionapi.dto.TransactionRequest;
import com.uap.popquizset1.transactionapi.dto.TransactionDetailsResponse;
import com.uap.popquizset1.transactionapi.dto.TransactionResponse;

public interface TransactionService {
    TransactionResponse createTransaction(TransactionRequest request);
    TransactionDetailsResponse getTransactionDetails(Long transactionId);
}