package co.com.flypass.ports.inbound;


import co.com.flypass.models.User;

public interface UserUseCasePort {

    void save(User user);

    void update(User user);

    void deleteUserById(Long clientId);

}
