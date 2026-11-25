package domain;

public class Trainer extends  User{

    private TrainingType specialization;

    public Trainer(Long id, String firstName, String lastName, String userName, String password, Boolean isActive, TrainingType specialization) {
        super(id, firstName, lastName, userName, password, isActive);
        this.specialization = specialization;
    }

    public TrainingType getSpecialization() {
        return specialization;
    }

    public void setSpecialization(TrainingType specialization) {
        this.specialization = specialization;
    }
}
