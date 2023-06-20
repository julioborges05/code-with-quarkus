package com.vollmed.domain.doctor;

import com.vollmed.domain.address.AddressEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "doctor")
public class DoctorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private Long crm;

    @Enumerated(EnumType.STRING)
    @Column(name = "speciality")
    private SpecialityEnum specialityEnum;

    @Embedded
    private AddressEntity addressEntity;

    public String getName() {
        return this.name;
    }

    public Long getCrm() {
        return this.crm;
    }

    public SpecialityEnum getSpeciality() {
        return this.specialityEnum;
    }
}
