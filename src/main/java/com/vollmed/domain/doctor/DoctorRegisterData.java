package com.vollmed.domain.doctor;

import com.vollmed.domain.address.AddressRecord;

public record DoctorRegisterData(String name,
                                 String email,
                                 String phone,
                                 Long crm,
                                 SpecialityEnum specialityEnum,
                                 AddressRecord addressRecord) {
}
