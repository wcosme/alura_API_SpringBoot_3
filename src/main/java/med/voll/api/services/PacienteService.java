package med.voll.api.services;

import med.voll.api.model.Medico;
import med.voll.api.model.Paciente;
import med.voll.api.records.PacienteRecord;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PacienteService {
    void salvar(Paciente paciente);

    Page<PacienteRecord> listarPaciente(Pageable paginacao);
}
