package com.example.simplespringapp.service;

import com.example.simplespringapp.model.Account;
import com.example.simplespringapp.model.Address;
import com.example.simplespringapp.model.Client;
import com.example.simplespringapp.repository.SimpleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class SimpleService {

    @Autowired
    SimpleRepository simpleRepository;

    public Optional<Client> getClientAccountById(Long id) {

        return simpleRepository.findById(id);
    }

    public Optional<Address> getFirstClientAddress(Long id) {

        Client client = simpleRepository.findById(id).get();
        return client.getAddresses().stream().findFirst();

    }

    public List<Account> getAllAccounts(Long id) {
        Client client = simpleRepository.findById(id).get();
        return  client.getAccounts();
    }


 }
