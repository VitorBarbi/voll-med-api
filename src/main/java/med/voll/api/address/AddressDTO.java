package med.voll.api.address;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record AddressDTO(
        @NotBlank
        String state,
        @NotBlank
        String city,
        @NotBlank
        @Pattern(regexp = "\\d{8}")
        String zipCode,
        @NotBlank
        String neighborhood,
        @NotBlank
        String street,
        String additionalInformation,
        String number
) {
}