package med.voll.api.records;

import med.voll.api.Enuns.Especialidade;
import med.voll.api.model.Medico;

public record ListaMedicoRecord(Long id, String nome, String email, String crm, Especialidade especialidade) {

    public ListaMedicoRecord(Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
