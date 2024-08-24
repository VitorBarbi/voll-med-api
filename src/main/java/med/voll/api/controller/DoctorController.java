package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.doctor.Doctor;
import med.voll.api.doctor.DoctorCreateDTO;
import med.voll.api.doctor.DoctorReadDTO;
import med.voll.api.doctor.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("doctors")
public class DoctorController {
    @Autowired
    private DoctorRepository repository;

    @PostMapping
    public void register(@RequestBody @Valid DoctorCreateDTO data){
        this.repository.save(new Doctor(data));
    }

    @GetMapping
    public List<DoctorReadDTO> list(){
        return this.repository.findAll().stream().map(DoctorReadDTO::new).toList();
    }
}