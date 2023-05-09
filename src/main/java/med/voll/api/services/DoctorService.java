package med.voll.api.services;

import med.voll.api.model.Doctor;
import med.voll.api.records.ListDoctorRecord;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface DoctorService {
    void save(Doctor doctor);

    Page<ListDoctorRecord> listDoctors(Pageable paginacao);

    Optional<Doctor> getDoctorById(Long id);

    void deleteDoctorById(Long id);

    Optional<Doctor> detailById(Long id);
}
