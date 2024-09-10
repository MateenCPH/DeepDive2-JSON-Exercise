package dat.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import dat.entities.Account;
import dat.entities.Address;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@JsonIgnoreProperties(ignoreUnknown = true) // This will ignore unknown fields in the JSON
public class UserDTO {


    private String fullName;
    private String city;
    private String zipCode;
    @JsonProperty("isActive") // JSON field name is "isActive"
    private boolean isActive;

    private Address address;
    private Account account;

    public UserDTO(@JsonProperty("firstName") String firstName,
                   @JsonProperty("lastName") String lastName,
                   @JsonProperty("city") String city,
                   @JsonProperty("zipCode") String zipCode,
                   @JsonProperty("isActive") boolean isActive) {
        this.fullName = firstName + " " + lastName;
        this.city = address.getCity();
        this.zipCode = String.valueOf(address.getZipCode());
        this.isActive = getAccount().isActive();
    }
}
