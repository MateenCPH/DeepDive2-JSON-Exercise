package dat.entities;

import lombok.Data;
import lombok.ToString;

@Data
@ToString

public class Address {
    private String street;
    private String city;
    private Integer zipCode;

    public Address(String street, String city, Integer zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }
}
