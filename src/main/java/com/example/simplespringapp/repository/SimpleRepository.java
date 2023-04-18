package com.example.simplespringapp.repository;

import com.example.simplespringapp.model.Account;
import com.example.simplespringapp.model.Client;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface SimpleRepository extends CrudRepository<Client, Long> {

    @Override
    Optional<Client> findById(Long aLong);


}
