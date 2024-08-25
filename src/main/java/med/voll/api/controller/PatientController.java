package med.voll.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.doctor.DoctorUpdateDTO;
import med.voll.api.patient.*;
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
    @Transactional
    public void register(@RequestBody @Valid PatientCreateDTO data){
        this.repository.save(new Patient(data));
    }

    @GetMapping
    public Page<PatientReadDTO> list(@PageableDefault(sort = {"name"}) Pageable pagination){
        return this.repository.findAll(pagination).map(PatientReadDTO::new);
    }

    @PutMapping
    @Transactional
    public void update(@RequestBody @Valid PatientUpdateDTO data){
        var patient = repository.getReferenceById(data.id());
        patient.updateData(data);
    }
}