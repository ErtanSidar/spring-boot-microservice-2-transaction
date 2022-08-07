package com.essoft.springbootmicroservice2transaction.service;

import java.util.List;

import com.essoft.springbootmicroservice2transaction.model.Transaction;

public interface ITransactionService
{
    Transaction saveTransaction(Transaction transaction);

    void deleteTransaction(Long transactionId);

    List<Transaction> findAllTransactionsOfUser(Long userId);
}
