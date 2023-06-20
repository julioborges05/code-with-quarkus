package com.vollmed.controller;

import com.vollmed.domain.doctor.DoctorRegisterData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @PostMapping
    public ResponseEntity<DoctorRegisterData> saveNewDoctor(@RequestBody DoctorRegisterData doctorRegisterData) {
        return new ResponseEntity<>(doctorRegisterData, HttpStatus.OK);
    }

}
