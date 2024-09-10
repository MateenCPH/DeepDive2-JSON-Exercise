package dat.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString

public class Address {
    private String street;
    private String city;
    private Integer zipCode;

    public Address(){} // This is required for Jackson to convert JSON to Java object

    // This constructor is not required because Jackson will use the default constructor to create an object
//    public Address(@JsonProperty("street") String street,
//                   @JsonProperty("city") String city,
//                   @JsonProperty("zipCode") Integer zipCode) {
//        this.street = street;
//        this.city = city;
//        this.zipCode = zipCode;
//    }
}
