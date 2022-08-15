package com.cydeo.enums;

public enum Status {
    OPEN("Open"),
    IN_PROGRESS("In Progress"),
    COMPLETED("Completed");

    public final String value;

    Status(String value) {
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
