package co.com.flypass.ports.outbound;


import co.com.flypass.models.User;

public interface UserRepositoryPort {

    void save(User user);

    void update(User user);

    void delete(Long clientId);

}
