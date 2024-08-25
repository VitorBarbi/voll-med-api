package med.voll.api.address;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private String state;
    private String city;

    @Column(name = "zip_code")
    private String zipCode;

    private String neighborhood;
    private String street;

    @Column(name = "additional_information")
    private String additionalInformation;

    private String number;

    public Address(AddressDTO address) {
        this.state = address.state();
        this.city = address.city();
        this.zipCode = address.zipCode();
        this.neighborhood = address.neighborhood();
        this.street = address.street();
        this.number = address.number();
        this.additionalInformation = address.additionalInformation();
    }

    public void updateData(AddressDTO data) {
        if(data.state() != null) {
            this.state = data.state();
        }
        if(data.city() != null) {
            this.city = data.city();
        }
        if(data.zipCode() != null) {
            this.zipCode = data.zipCode();
        }
        if(data.neighborhood() != null) {
            this.neighborhood = data.neighborhood();
        }
        if(data.street() != null) {
            this.street = data.street();
        }
        if(data.number() != null) {
            this.number = data.number();
        }
        if(data.additionalInformation() != null) {
            this.additionalInformation = data.additionalInformation();
        }
    }
}