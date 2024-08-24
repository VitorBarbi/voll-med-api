package med.voll.api.patient;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import med.voll.api.address.AddressDTO;

public record PatientDTO(
        @NotBlank
        String name,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String phone,
        @NotBlank
        String cpf,
        @NotNull
        @Valid
        AddressDTO address
) {
}