package dat.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
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

    public User(){} // This is required for Jackson to convert JSON to Java object

    // This constructor is not required because Jackson will use the default constructor to create an object
//    public User(@JsonProperty("firstName") String firstName,
//                @JsonProperty("lastName") String lastName,
//                @JsonProperty("birthDate") Date birthDate,
//                @JsonProperty("address") Address address,
//                @JsonProperty("acount") Account account) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.birthDate = birthDate;
//        this.address = address;
//        this.account = account;
//    }
}
