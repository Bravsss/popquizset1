package com.uap.popquizset1.transactionapi.repository;

import com.uap.popquizset1.transactionapi.entity.TransactionItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionItemRepository extends JpaRepository<TransactionItem, Long> {
    List<TransactionItem> findByTransactionId(Long transactionId);
}