package co.com.flypass.apirest.handlers.implement;

import co.com.flypass.apirest.dtos.request.client.UserRequestDTO;
import co.com.flypass.apirest.dtos.request.client.UserUpdateRequestDTO;
import co.com.flypass.apirest.handlers.IUserHandler;
import co.com.flypass.apirest.mappers.IClientDTOMapper;
import co.com.flypass.ports.inbound.ClientUseCasePort;
import org.springframework.stereotype.Service;

@Service
public class UserHandlerImpl implements IUserHandler {
    private final ClientUseCasePort clientUseCasePort;
    private final IClientDTOMapper clientDTOMapper;

    public UserHandlerImpl(ClientUseCasePort clientUseCasePort, IClientDTOMapper clientDTOMapper) {
        this.clientUseCasePort = clientUseCasePort;
        this.clientDTOMapper = clientDTOMapper;
    }

    @Override
    public void save(UserRequestDTO userRequestDTO) {
        clientUseCasePort.save(clientDTOMapper.toUser(userRequestDTO));
    }

    @Override
    public void update(UserUpdateRequestDTO userUpdateRequestDTO) {
        clientUseCasePort.save(clientDTOMapper.toUser(userUpdateRequestDTO));
    }

    @Override
    public void deleteClientById(Long clientId) {
        clientUseCasePort.deleteClientById(clientId);
    }
}
