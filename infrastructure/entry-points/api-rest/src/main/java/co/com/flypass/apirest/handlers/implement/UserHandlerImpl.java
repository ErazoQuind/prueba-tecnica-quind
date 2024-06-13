package co.com.flypass.apirest.handlers.implement;

import co.com.flypass.apirest.dtos.request.user.UserRequestDTO;
import co.com.flypass.apirest.dtos.request.user.UserUpdateRequestDTO;
import co.com.flypass.apirest.handlers.IUserHandler;
import co.com.flypass.apirest.mappers.IClientDTOMapper;
import co.com.flypass.ports.inbound.UserUseCasePort;
import org.springframework.stereotype.Service;

@Service
public class UserHandlerImpl implements IUserHandler {
    private final UserUseCasePort userUseCasePort;
    private final IClientDTOMapper clientDTOMapper;

    public UserHandlerImpl(UserUseCasePort userUseCasePort, IClientDTOMapper clientDTOMapper) {
        this.userUseCasePort = userUseCasePort;
        this.clientDTOMapper = clientDTOMapper;
    }

    @Override
    public void save(UserRequestDTO userRequestDTO) {
        userUseCasePort.save(clientDTOMapper.toUser(userRequestDTO));
    }

    @Override
    public void update(UserUpdateRequestDTO userUpdateRequestDTO) {
        userUseCasePort.save(clientDTOMapper.toUser(userUpdateRequestDTO));
    }

    @Override
    public void deleteClientById(Long clientId) {
        userUseCasePort.deleteUserById(clientId);
    }
}
