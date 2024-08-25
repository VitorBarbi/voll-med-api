package med.voll.api.doctor;

public record DoctorReadDTO(
        Long id,
        String name,
        String email,
        String phone,
        String crm,
        Specialty specialty
) {
    public DoctorReadDTO(Doctor doctor){
        this(
                doctor.getId(),
                doctor.getName(),
                doctor.getEmail(),
                doctor.getPhone(),
                doctor.getCrm(),
                doctor.getSpecialty()
        );
    }
}