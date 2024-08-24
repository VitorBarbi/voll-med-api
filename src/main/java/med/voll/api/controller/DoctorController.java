package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.doctor.Doctor;
import med.voll.api.doctor.DoctorDTO;
import med.voll.api.doctor.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("doctors")
public class DoctorController {
    @Autowired
    private DoctorRepository repository;

    @PostMapping
    public void register(@RequestBody @Valid DoctorDTO data){
        this.repository.save(new Doctor(data));
    }
}