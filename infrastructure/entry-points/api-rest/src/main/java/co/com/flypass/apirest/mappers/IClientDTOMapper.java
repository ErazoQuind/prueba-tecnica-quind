package co.com.flypass.apirest.mappers;

import co.com.flypass.apirest.dtos.request.client.UserRequestDTO;
import co.com.flypass.apirest.dtos.request.client.UserUpdateRequestDTO;
import co.com.flypass.apirest.dtos.response.UserResponseDTO;
import co.com.flypass.models.User;

public interface IClientDTOMapper {
    User toUser(UserRequestDTO newUserRequestDTO);
    User toUser(UserUpdateRequestDTO updateUserRequestDTO);
    UserResponseDTO toUserResponseDto(User user);
}
