package med.voll.api.services;

import med.voll.api.model.Patient;
import med.voll.api.records.ListPatientRecord;
import med.voll.api.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PatientImpl implements PatientService {

    @Autowired
    private PatientRepository repository;

    @Override
    public void save(Patient patient) {

        repository.save(patient);
    }

    @Override
    public Page list(Pageable paginacao) {
        return repository.findAll(paginacao).map(ListPatientRecord::new);
    }
}
