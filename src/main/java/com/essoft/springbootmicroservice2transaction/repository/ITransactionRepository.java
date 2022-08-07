package com.essoft.springbootmicroservice2transaction.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.essoft.springbootmicroservice2transaction.model.Transaction;

public interface ITransactionRepository extends JpaRepository<Transaction, Long>
{
    List<Transaction> findAllByUserId(Long userId);
}
