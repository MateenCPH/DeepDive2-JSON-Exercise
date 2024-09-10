package dat.daos;

import dat.entities.User;
import jakarta.persistence.EntityManagerFactory;

import java.util.Set;

public class PersonDAO implements IDAO<User> {
    EntityManagerFactory emf;

    public PersonDAO(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public User create(User person) {
        return null;
    }


    @Override
    public User update(User person) {
        return null;
    }

    @Override
    public void delete(User person) {

    }

    @Override
    public User getById(Long id) {
        return null;
    }

    @Override
    public Set<User> getAll() {
        return Set.of();
    }
}
