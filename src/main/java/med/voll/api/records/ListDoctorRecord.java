package med.voll.api.records;

import med.voll.api.Enuns.Specialty;
import med.voll.api.model.Doctor;

public record ListDoctorRecord(Long id, String name, String email, String crm, Specialty specialty) {

    public ListDoctorRecord(Doctor doctor) {
        this(doctor.getId(), doctor.getName(), doctor.getEmail(), doctor.getCrm(), doctor.getSpecialty());
    }
}
