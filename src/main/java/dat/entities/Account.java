package dat.entities;

import lombok.Data;
import lombok.ToString;

@Data
@ToString

public class Account {
    private Long id;
    private String balance;
    private boolean isActive;

    public Account(Long id, String balance, boolean isActive) {
        this.id = id;
        this.balance = balance;
        this.isActive = isActive;
    }
}
