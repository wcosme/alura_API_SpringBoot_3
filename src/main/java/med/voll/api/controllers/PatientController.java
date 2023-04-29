package med.voll.api.controllers;

import med.voll.api.model.Patient;
import med.voll.api.records.PatientRecord;
import med.voll.api.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/vi/patients")
public class PatientController {

    @Autowired
    private PatientService service;

    @PostMapping
    @Transactional
    public void savePatient(@RequestBody PatientRecord dto){
        service.save(new Patient(dto));
    }

    @GetMapping
    public Page<PatientRecord> listPatient(@PageableDefault(page = 0, size = 10, sort = {"nome"}) Pageable page) {
        return service.list(page);
    }
}
