package med.voll.api.records;

import med.voll.api.model.Medico;

public record AtualizacaoMedicoRecord(Long id, String nome, String telefone, EnderecoRecord endereco) {

    public AtualizacaoMedicoRecord(Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getTelefone(), null);
    }
}
