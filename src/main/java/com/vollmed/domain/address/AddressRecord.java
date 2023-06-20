package com.vollmed.domain.address;

public record AddressRecord(String address,
                            String number,
                            String complement,
                            String district,
                            String city,
                            String state,
                            String zipCode) {
}
