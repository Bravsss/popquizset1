package com.uap.popquizset1.transactionapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.uap.popquizset1.transactionapi.dto.TransactionRequest;
import com.uap.popquizset1.transactionapi.dto.TransactionDetailsResponse;
import com.uap.popquizset1.transactionapi.dto.TransactionResponse;
import com.uap.popquizset1.transactionapi.service.TransactionService;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping
    public ResponseEntity<TransactionResponse> createTransaction(@RequestBody TransactionRequest request) {
        TransactionResponse response = transactionService.createTransaction(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/{transactionId}")
    public ResponseEntity<TransactionDetailsResponse> getTransactionDetails(@PathVariable Long transactionId) {
        TransactionDetailsResponse response = transactionService.getTransactionDetails(transactionId);
        if (response != null) {
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}