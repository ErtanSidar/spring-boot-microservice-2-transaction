package com.essoft.springbootmicroservice2transaction.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.essoft.springbootmicroservice2transaction.model.Transaction;
import com.essoft.springbootmicroservice2transaction.repository.ITransactionRepository;

@Service
public class TransactionService implements ITransactionService
{
    @Autowired
    private ITransactionRepository transactionRepository;

    @Override
    public Transaction saveTransaction(Transaction transaction)
    {
        transaction.setTransactionTime(LocalDateTime.now());
        return transactionRepository.save(transaction);
    }

    @Override
    public void deleteTransaction(Long transactionId)
    {
        transactionRepository.deleteById(transactionId);
    }

    @Override
    public List<Transaction> findAllTransactionsOfUser(Long userId)
    {
        return transactionRepository.findAllByUserId(userId);
    }
}
