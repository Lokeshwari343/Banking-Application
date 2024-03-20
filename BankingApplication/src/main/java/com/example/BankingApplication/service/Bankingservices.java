package com.example.BankingApplication.service;


import com.example.BankingApplication.model.SBIbanking;
import com.example.BankingApplication.repository.Bankingrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
@Service
public class Bankingservices {
    @Autowired
    private Bankingrepo repo;
    public Mono<SBIbanking> saveAccount(Mono<SBIbanking> sbirequest) {
        return sbirequest.flatMap(repo::save);
    }
}