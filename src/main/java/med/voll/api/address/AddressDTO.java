package med.voll.api.address;

public record AddressDTO(
        String state,
        String city,
        String zipCode,
        String neighborhood,
        String street,
        String additionalInformation,
        String number
) {
}