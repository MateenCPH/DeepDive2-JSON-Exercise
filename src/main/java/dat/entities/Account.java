package dat.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString

public class Account {
    private int id;
    private String balance;
    @JsonProperty("isActive") // This annotation is used because JSON recognized the field as "active" instead of "isActive"
    private boolean isActive;

    public Account(){} // This is required for Jackson to convert JSON to Java object


    // This constructor is not required because Jackson will use the default constructor to create an object
//    public Account(@JsonProperty("id") int id,
//                   @JsonProperty("balance") String balance,
//                   @JsonProperty("isActive") boolean isActive) {
//        this.id = id;
//        this.balance = balance;
//        this.isActive = isActive;
//    }
}
