package med.voll.api.doctor;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.address.AddressDTO;

public record DoctorCreateDTO(
        @NotBlank
        String name,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String phone,
        @NotNull
        @Pattern(regexp = "\\d{4,6}")
        String crm,
        @NotNull
        Specialty specialty,
        @NotNull
        @Valid
        AddressDTO address
) {
}