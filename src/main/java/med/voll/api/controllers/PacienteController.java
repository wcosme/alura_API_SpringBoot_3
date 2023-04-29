package med.voll.api.controllers;

import med.voll.api.model.Paciente;
import med.voll.api.records.PacienteRecord;
import med.voll.api.services.MedicoService;
import med.voll.api.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteService service;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody PacienteRecord dto){
        service.salvar(new Paciente(dto));
    }

    @GetMapping
    public Page<PacienteRecord> listar(@PageableDefault(page = 0, size = 10, sort = {"nome"}) Pageable paginacao) {
        return service.listarPaciente(paginacao);
    }
}
