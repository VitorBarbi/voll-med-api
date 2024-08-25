package med.voll.api.doctor;

import jakarta.validation.constraints.NotNull;
import med.voll.api.address.Address;
import med.voll.api.address.AddressDTO;

public record DoctorUpdateDTO(
        @NotNull
        Long id,
        String name,
        String phone,
        AddressDTO address
) {
}