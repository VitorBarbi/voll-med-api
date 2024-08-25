package med.voll.api.patient;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import med.voll.api.address.AddressDTO;

public record PatientReadDTO(
        Long id,
        String name,
        String email,
        String cpf
) {
        public PatientReadDTO(Patient patient){
                this(
                        patient.getId(),
                        patient.getName(),
                        patient.getEmail(),
                        patient.getCpf()
                );
        }
}