package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.doctor.Doctor;
import med.voll.api.doctor.DoctorCreateDTO;
import med.voll.api.doctor.DoctorReadDTO;
import med.voll.api.doctor.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
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
    public Page<DoctorReadDTO> list(@PageableDefault(sort = {"name"}) Pageable pagination){
        return this.repository.findAll(pagination).map(DoctorReadDTO::new);
    }
}