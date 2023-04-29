package med.voll.api.services;

import med.voll.api.model.Medico;
import med.voll.api.records.ListaMedicoRecord;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface MedicoService {
    void salvar(Medico medico);

    Page<ListaMedicoRecord> listarMedicos(Pageable paginacao);
}
