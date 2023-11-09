package com.uap.popquizset1.transactionapi.repository;

import com.uap.popquizset1.transactionapi.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}