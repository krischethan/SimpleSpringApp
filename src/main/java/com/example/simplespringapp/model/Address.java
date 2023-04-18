package com.example.simplespringapp.model;

import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.Data;

@Builder
@Entity
@Data
public class Address {

    String addressline1;

    String addressline2;

    AddressType addressType;

    String postCode;

    String country;

}
