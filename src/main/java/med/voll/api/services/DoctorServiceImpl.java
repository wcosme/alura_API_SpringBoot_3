package med.voll.api.services;

import med.voll.api.model.Doctor;
import med.voll.api.records.ListDoctorRecord;
import med.voll.api.repositories.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

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
        return repository.findAllByActiveTrue(page).map(ListDoctorRecord::new);
    }

    @Override
    public Optional<Doctor> getDoctorById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void deleteDoctorById(Long id) {
         Optional<Doctor> doctor = repository.findById(id);

         if(doctor.isPresent()) {
             doctor.get().deleteDoctor();
         }
    }
}
