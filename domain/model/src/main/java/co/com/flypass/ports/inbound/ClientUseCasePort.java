package co.com.flypass.ports.inbound;


import co.com.flypass.models.User;

public interface ClientUseCasePort {

    void save(User user);

    void update(User user);

    void deleteClientById(Long clientId);

}
