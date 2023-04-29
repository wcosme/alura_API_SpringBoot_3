package med.voll.api.services;

import med.voll.api.model.Medico;
import med.voll.api.records.ListaMedicoRecord;
import med.voll.api.repositories.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicoServiceImpl implements MedicoService{

    @Autowired
    private MedicoRepository repository;

    @Override
    public void salvar(Medico medico) {

        repository.save(medico);
    }

    @Override
    public Page<ListaMedicoRecord> listarMedicos(Pageable paginacao) {
        return repository.findAll(paginacao).map(ListaMedicoRecord::new);
    }
}
