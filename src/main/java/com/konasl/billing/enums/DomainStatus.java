package com.konasl.billing.enums;

public enum DomainStatus {
    ACTIVE(0),
    DELETED(1);

    private final int value;

    DomainStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static DomainStatus fromValue(int value) {
        for (DomainStatus status : DomainStatus.values()) {
            if (status.value == value) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

