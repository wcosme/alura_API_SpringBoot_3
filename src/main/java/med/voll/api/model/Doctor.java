package med.voll.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.Enuns.Specialty;
import med.voll.api.records.DoctorRecord;
import med.voll.api.records.UpdateDoctorRecord;

@Table(name = "doctors")
@Entity(name = "Doctor")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String crm;
    private String telephone;

    @Enumerated(EnumType.STRING)
    private Specialty specialty;

    @Embedded
    private Address address;

    public Doctor(DoctorRecord record) {
        this.name = record.name();
        this.email = record.email();
        this.crm = record.crm();
        this.telephone = record.telephone();
        this.specialty = record.specialty();
        this.address = new Address(record.address());
    }

    public void updateInformation(UpdateDoctorRecord record){

        if(record.name() != null){
            this.name = record.name();
        }
        if(record.telephone() != null){
            this.telephone = record.telephone();
        }
        if(record.address() != null){
            this.address.updateInformationAddress(record.address());
        }
    }

}
