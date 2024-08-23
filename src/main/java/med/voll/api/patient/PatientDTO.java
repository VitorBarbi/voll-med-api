package med.voll.api.patient;

import med.voll.api.address.AddressDTO;

public record PatientDTO(
        String name,
        String email,
        String phone,
        String cpf,
        AddressDTO address
) {
}