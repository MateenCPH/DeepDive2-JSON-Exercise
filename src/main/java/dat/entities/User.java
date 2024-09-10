package dat.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Data
@ToString
public class User {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Address address;
    private Account account;

    public User(String firstName, String lastName, Date birthDate, Address address, Account account) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
        this.account = account;
    }
}
