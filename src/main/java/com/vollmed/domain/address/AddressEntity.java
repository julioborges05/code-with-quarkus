package com.vollmed.domain.address;

import jakarta.persistence.Embeddable;

@Embeddable
public class AddressEntity {
    private String address;
    private String zipCode;
    private String complement;
    private String number;
    private String state;
    private String city;
}
