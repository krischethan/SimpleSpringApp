package com.example.simplespringapp.model;

public enum IdentificationType {

    PASSPORT("Passport"),
    DRIVING_LICENCE("Driving Licence"),
    PHOTO_ID("Photo ID Card");

    private String description;

    IdentificationType(String val) {
        this.description = val;
    }
}
