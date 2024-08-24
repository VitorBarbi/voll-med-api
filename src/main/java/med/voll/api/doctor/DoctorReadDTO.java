package med.voll.api.doctor;

public record DoctorReadDTO(
        String name,
        String email,
        String crm,
        Specialty specialty
) {
    public DoctorReadDTO(Doctor doctor){
        this(
                doctor.getName(),
                doctor.getEmail(),
                doctor.getCrm(),
                doctor.getSpecialty()
        );
    }
}
