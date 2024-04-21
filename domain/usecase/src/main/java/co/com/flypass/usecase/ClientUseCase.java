package co.com.flypass.usecase;

import co.com.flypass.models.User;
import co.com.flypass.ports.inbound.ClientUseCasePort;
import co.com.flypass.ports.outbound.ClientRepositoryPort;


public class ClientUseCase implements ClientUseCasePort {

    private final ClientRepositoryPort clientRepositoryPort;


    public ClientUseCase(ClientRepositoryPort clientRepositoryPort) {
        this.clientRepositoryPort = clientRepositoryPort;
    }

    public void save(User user) {
        clientRepositoryPort.save(user);
    }

    public void update(User user) {
        clientRepositoryPort.update(user);
    }

    public void deleteClientById(Long clientId){
        clientRepositoryPort.delete(clientId);

    }
}
