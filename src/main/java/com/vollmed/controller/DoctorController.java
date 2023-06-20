package com.vollmed.controller;

import com.vollmed.domain.doctor.DoctorRegisterData;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @PostMapping
    public DoctorRegisterData saveNewDoctor(@RequestBody DoctorRegisterData doctorRegisterData) {
        return doctorRegisterData;
    }

}
