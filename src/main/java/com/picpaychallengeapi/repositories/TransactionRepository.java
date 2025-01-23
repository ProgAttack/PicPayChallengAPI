package com.picpaychallengeapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.picpaychallengeapi.entities.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long>{

	
}
