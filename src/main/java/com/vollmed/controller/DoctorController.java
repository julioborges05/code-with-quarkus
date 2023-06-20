package com.vollmed.controller;

import com.vollmed.domain.doctor.dto.DoctorRegisterData;
import com.vollmed.domain.doctor.DoctorRepository;
import com.vollmed.domain.doctor.dto.DoctorResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    DoctorRepository doctorRepository;

    @PostMapping
    public ResponseEntity<DoctorRegisterData> saveNewDoctor(@RequestBody DoctorRegisterData doctorRegisterData) {
        return new ResponseEntity<>(doctorRegisterData, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<DoctorResponseData>> listAllDoctors() {
        var doctorList = doctorRepository.findAll().stream().map(DoctorResponseData::new).toList();
        return new ResponseEntity<>(doctorList, HttpStatus.OK);
    }

}
