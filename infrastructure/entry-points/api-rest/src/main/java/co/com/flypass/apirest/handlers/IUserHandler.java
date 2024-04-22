package co.com.flypass.apirest.handlers;

import co.com.flypass.apirest.dtos.request.client.UserRequestDTO;
import co.com.flypass.apirest.dtos.request.client.UserUpdateRequestDTO;

public interface IUserHandler {
    void save(UserRequestDTO userRequestDTO);
    void update(UserUpdateRequestDTO userUpdateRequestDTO);
    void deleteClientById(Long clientId);

}
