package com.cydeo.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Gender {

    MALE("Male"),
    FEMALE("Female");

    private final String value;

    Gender(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
