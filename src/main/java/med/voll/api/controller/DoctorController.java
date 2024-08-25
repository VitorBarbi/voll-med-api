package med.voll.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.doctor.*;
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
    @Transactional
    public void register(@RequestBody @Valid DoctorCreateDTO data){
        this.repository.save(new Doctor(data));
    }

    @GetMapping
    public Page<DoctorReadDTO> list(@PageableDefault(sort = {"name"}) Pageable pagination){
        return this.repository.findAllByActiveTrue(pagination).map(DoctorReadDTO::new);
    }

    @PutMapping
    @Transactional
    public void update(@RequestBody @Valid DoctorUpdateDTO data){
        var doctor = repository.getReferenceById(data.id());
        doctor.updateData(data);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void delete(@PathVariable Long id){
        var doctor = repository.getReferenceById(id);
        doctor.delete();
    }
}