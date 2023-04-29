package med.voll.api.controllers;

import jakarta.validation.Valid;
import med.voll.api.records.UpdateDoctorRecord;
import med.voll.api.records.ListDoctorRecord;
import med.voll.api.records.DoctorRecord;
import med.voll.api.model.Doctor;
import med.voll.api.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/doctors")
public class DoctorController {

    @Autowired
    private DoctorService service;

    @PostMapping()
    @Transactional
    public void register(@RequestBody @Valid DoctorRecord dto){
        service.save(new Doctor(dto));
    }

    @GetMapping()
    public Page<ListDoctorRecord> list(Pageable page){
        return service.listDoctors(page);
    }

    @PutMapping()
    @Transactional
    public void update(@RequestBody @Valid UpdateDoctorRecord dto){

    }
}
