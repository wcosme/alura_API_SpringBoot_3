package med.voll.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.records.PatientRecord;

@Getter
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Patient")
@Table(name = "patients")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String cpf;
    private String telephone;

    @Embedded
    private Address address;

    public Patient(PatientRecord record) {
        this.name = record.name();
        this.email = record.email();
        this.telephone = record.telephone();
        this.cpf = record.cpf();
        this.address = new Address(record.address());
    }

}