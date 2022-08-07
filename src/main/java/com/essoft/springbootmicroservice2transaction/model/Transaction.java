package com.essoft.springbootmicroservice2transaction.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="transaction")
@Data
public class Transaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="user_id", nullable = false)
	private Long userId;
	
	@Column(name="product_id", nullable = false)
	private Long productId;
	
	@Column(name="transaction_time")
	private LocalDateTime transactionTime;
	
}
