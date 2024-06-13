package co.com.flypass.apirest.handlers;

import co.com.flypass.apirest.dtos.request.user.UserRequestDTO;
import co.com.flypass.apirest.dtos.request.user.UserUpdateRequestDTO;

public interface IUserHandler {
    void save(UserRequestDTO userRequestDTO);
    void update(UserUpdateRequestDTO userUpdateRequestDTO);
    void deleteClientById(Long clientId);

}
