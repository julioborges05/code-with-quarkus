package com.vollmed.domain.doctor.dto;

import com.vollmed.domain.doctor.DoctorEntity;
import com.vollmed.domain.doctor.SpecialityEnum;

public record DoctorResponseData(String name, Long crm, SpecialityEnum speciality) {
    public DoctorResponseData(DoctorEntity doctorEntity) {
        this(doctorEntity.getName(), doctorEntity.getCrm(), doctorEntity.getSpeciality());
    }
}
