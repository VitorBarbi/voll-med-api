package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.patient.Patient;
import med.voll.api.patient.PatientCreateDTO;
import med.voll.api.patient.PatientReadDTO;
import med.voll.api.patient.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("patients")
public class PatientController {
    @Autowired
    private PatientRepository repository;

    @PostMapping
    public void register(@RequestBody @Valid PatientCreateDTO data){
        this.repository.save(new Patient(data));
    }

    @GetMapping
    public Page<PatientReadDTO> list(@PageableDefault(sort = {"name"}) Pageable pagination){
        return this.repository.findAll(pagination).map(PatientReadDTO::new);
    }
}