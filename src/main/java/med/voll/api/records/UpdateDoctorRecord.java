package med.voll.api.records;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import med.voll.api.model.Address;
import med.voll.api.model.Doctor;


public record UpdateDoctorRecord(

        @NotNull
        Long id,
        String name,
        String telephone,
        Address address) {

    public UpdateDoctorRecord(Doctor doctor) {
        this(doctor.getId(), doctor.getName(), doctor.getTelephone(), doctor.getAddress());
    }
}
