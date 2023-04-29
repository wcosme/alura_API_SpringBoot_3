package med.voll.api.services;

import med.voll.api.model.Doctor;
import med.voll.api.records.ListDoctorRecord;
import med.voll.api.repositories.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorRepository repository;

    @Override
    public void save(Doctor doctor) {

        repository.save(doctor);
    }

    @Override
    public Page<ListDoctorRecord> listDoctors(Pageable page) {
        return repository.findAll(page).map(ListDoctorRecord::new);
    }
}