package med.voll.api.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.records.AddressRecord;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    private String street;
    private String neighborhood;
    private String postcode;
    private String number;
    private String complement;
    private String city;
    private String state;

    public Address(AddressRecord address) {
        this.street = address.street();
        this.neighborhood = address.neighborhood();
        this.postcode = address.postcode();
        this.state = address.state();
        this.city = address.city();
        this.number = address.number();
        this.complement = address.complement();
    }

    public void updateInformationAddress(Address updateAddress) {

        if(updateAddress.street != null){
            this.street = updateAddress.street;
        }
        if(updateAddress.neighborhood != null){
            this.neighborhood = updateAddress.neighborhood;
        }
        if(updateAddress.postcode != null){
            this.postcode = updateAddress.postcode;
        }
        if(updateAddress.number != null){
            this.number = updateAddress.number;
        }
        if(updateAddress.complement != null){
            this.complement = updateAddress.complement;
        }
        if(updateAddress.city != null){
            this.city = updateAddress.city;
        }
        if(updateAddress.state != null){
            this.state = updateAddress.state;
        }
    }
}
