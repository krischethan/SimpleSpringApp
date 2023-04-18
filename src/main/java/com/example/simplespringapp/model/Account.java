package com.example.simplespringapp.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Account {

    AccountType accountType;

    Long accountNo;


}
