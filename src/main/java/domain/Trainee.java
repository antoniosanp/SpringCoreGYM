package domain;

import java.time.LocalDate;
import java.util.Date;

public class Trainee  extends  User{
    private LocalDate birthDate;
    private String address;

    public Trainee(Long id, String firstName, String lastName, String userName, String password, Boolean isActive, LocalDate birthDate, String address) {
        super(id, firstName, lastName, userName, password, isActive);
        this.birthDate = birthDate;
        this.address = address;
    }

    //setters & getters


    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
