package com.example.BankingApplication.repository;

import com.example.BankingApplication.model.SBIbanking;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface Bankingrepo extends ReactiveMongoRepository<SBIbanking,String > {
}