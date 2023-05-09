package med.voll.api.controllers;

import jakarta.validation.Valid;
import med.voll.api.records.DoctorDetail;
import med.voll.api.records.UpdateDoctorRecord;
import med.voll.api.records.ListDoctorRecord;
import med.voll.api.records.DoctorRecord;
import med.voll.api.model.Doctor;
import med.voll.api.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Optional;

@RestController
@RequestMapping("api/v1/doctors")
public class DoctorController {

    @Autowired
    private DoctorService service;

    @PostMapping()
    @Transactional
    public ResponseEntity register(@RequestBody @Valid DoctorRecord dto, UriComponentsBuilder uriBuilder){

        var doctor = new Doctor(dto);
        service.save(doctor);

        var uri = uriBuilder.path("/api/v1/doctors/{}").buildAndExpand(doctor.getId()).toUri();
        return ResponseEntity.created(uri).body(new DoctorDetail(doctor));
    }

    @GetMapping("/{id}")
    public ResponseEntity detailById(@PathVariable Long id){
        Optional<Doctor> doctor = service.detailById(id);

        return ResponseEntity.ok(new DoctorDetail(doctor.get()));
    }


    @GetMapping()
    public ResponseEntity<Page<ListDoctorRecord>> list(Pageable page){

        var doctors = service.listDoctors(page);

        return ResponseEntity.ok(doctors);
    }

    @PatchMapping
    @Transactional
    public ResponseEntity update(@RequestBody @Valid UpdateDoctorRecord record){
        Optional<Doctor> doctor = service.getDoctorById(record.id());
        doctor.get().updateInformation (record);

        return ResponseEntity.ok(new DoctorDetail(doctor.get()));
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity delete(@PathVariable Long id){
       service.deleteDoctorById(id);

       return ResponseEntity.noContent().build();
    }
}
