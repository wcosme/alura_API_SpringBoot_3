package med.voll.api.records;

import med.voll.api.model.Patient;

public record ListPatientRecord(Long id, String name, String email, String cpf) {

    public ListPatientRecord(Patient patient) {
        this(patient.getId(), patient.getName(), patient.getEmail(), patient.getCpf());
    }
}
