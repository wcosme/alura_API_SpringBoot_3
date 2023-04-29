package med.voll.api.services;

import med.voll.api.model.Patient;
import med.voll.api.records.PatientRecord;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PatientService {
    void save(Patient patient);

    Page<PatientRecord> list(Pageable page);
}
