package com.vollmed.domain.doctor.dto;

import com.vollmed.domain.address.AddressRecord;
import com.vollmed.domain.doctor.SpecialityEnum;

public record DoctorRegisterData(String name,
                                 String email,
                                 String phone,
                                 Long crm,
                                 SpecialityEnum specialityEnum,
                                 AddressRecord addressRecord) {
}
