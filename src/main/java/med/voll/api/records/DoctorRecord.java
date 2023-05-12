package med.voll.api.records;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.Enuns.Specialty;

public record DoctorRecord(

        @NotBlank(message = "{name.obrigatorio}")
        String name,

        @NotBlank(message = "{email.obrigatorio}")
        @Email(message = "{email.invalido}")
        String email,

        @NotBlank(message = "{telephone.obrigatorio}")
        String telephone,

        @NotBlank(message = "{crm.obrigatorio}")
        @Pattern(regexp = "\\d{4,6}")
        String crm,

        @NotNull(message = "{specialty.obrigatoria}")
        Specialty specialty,

        @NotNull@NotNull(message = "{address.obrigatorio}")
        @Valid
        AddressRecord address) {
}
