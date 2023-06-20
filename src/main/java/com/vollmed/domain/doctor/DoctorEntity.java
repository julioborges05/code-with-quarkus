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

    private String crm;

    @Enumerated(EnumType.STRING)
    private SpecialityEnum specialityEnum;

    @Embedded
    private AddressEntity addressEntity;
}
