package com.example.simplespringapp.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Client {

    List<Account> accounts;

    String firstName;

    String lastName;

    List<Address> addresses;

    IdentificationType identificationType;

    Long idNo;
}
