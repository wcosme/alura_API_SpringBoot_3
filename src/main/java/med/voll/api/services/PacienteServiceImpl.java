package med.voll.api.services;

import med.voll.api.model.Paciente;
import med.voll.api.records.ListaMedicoRecord;
import med.voll.api.records.ListaPacienteRecord;
import med.voll.api.records.PacienteRecord;
import med.voll.api.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PacienteServiceImpl implements PacienteService{

    @Autowired
    private PacienteRepository repository;

    @Override
    public void salvar(Paciente paciente) {

        repository.save(paciente);
    }

    @Override
    public Page listarPaciente(Pageable paginacao) {
        return repository.findAll(paginacao).map(ListaPacienteRecord::new);
    }
}
