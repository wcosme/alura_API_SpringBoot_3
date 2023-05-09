package med.voll.api.records;

import med.voll.api.Enuns.Specialty;
import med.voll.api.model.Address;
import med.voll.api.model.Doctor;

public record DoctorDetail(Long id, String name, String email, String crm, String telephone, Specialty specialty, Address address) {

    public DoctorDetail(Doctor doctor) {
        this(doctor.getId(), doctor.getName(), doctor.getEmail(), doctor.getCrm(), doctor.getTelephone(), doctor.getSpecialty(), doctor.getAddress());
    }

}
