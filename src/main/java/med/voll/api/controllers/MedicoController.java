package med.voll.api.controllers;

import jakarta.validation.Valid;
import med.voll.api.records.AtualizacaoMedicoRecord;
import med.voll.api.records.ListaMedicoRecord;
import med.voll.api.records.MedicoRecord;
import med.voll.api.model.Medico;
import med.voll.api.services.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoService service;

    @PostMapping()
    @Transactional
    public void cadastrar(@RequestBody @Valid MedicoRecord dto){
        service.salvar(new Medico(dto));
    }

    @GetMapping()
    public Page<ListaMedicoRecord> listar(Pageable paginacao){
        return service.listarMedicos(paginacao);
    }

    @PutMapping()
    @Transactional
    public void atualizar(@RequestBody @Valid AtualizacaoMedicoRecord dto){

    }
}
