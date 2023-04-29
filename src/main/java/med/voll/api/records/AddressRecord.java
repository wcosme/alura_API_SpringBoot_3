package med.voll.api.records;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record AddressRecord(

        @NotBlank
        String street,
        @NotBlank
        String neighborhood,
        @NotBlank
        @Pattern(regexp = "\\d{8}")
        String postcode,
        @NotBlank
        String city,
        @NotBlank
        String state,
        String complement,
        String number) {
}
