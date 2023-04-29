package med.voll.api.records;

import med.voll.api.model.Doctor;

public record UpdateDoctorRecord(Long id, String name, String telephone, AddressRecord address) {

    public UpdateDoctorRecord(Doctor doctor) {
        this(doctor.getId(), doctor.getName(), doctor.getTelephone(), null);
    }
}
