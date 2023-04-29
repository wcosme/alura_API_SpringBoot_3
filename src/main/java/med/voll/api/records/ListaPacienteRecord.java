package med.voll.api.records;

import med.voll.api.model.Paciente;

public record ListaPacienteRecord(Long id, String nome, String email, String cpf) {

    public ListaPacienteRecord(Paciente paciente) {
        this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getCpf());
    }
}
