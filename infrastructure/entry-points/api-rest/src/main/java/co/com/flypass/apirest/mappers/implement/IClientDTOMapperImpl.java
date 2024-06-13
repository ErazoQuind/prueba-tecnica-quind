package co.com.flypass.apirest.mappers.implement;

import co.com.flypass.apirest.dtos.request.user.UserRequestDTO;
import co.com.flypass.apirest.dtos.request.user.UserUpdateRequestDTO;
import co.com.flypass.apirest.dtos.response.UserResponseDTO;
import co.com.flypass.apirest.mappers.IClientDTOMapper;
import co.com.flypass.models.User;
import org.springframework.stereotype.Component;

@Component
public class IClientDTOMapperImpl implements IClientDTOMapper {
    @Override
    public User toUser(UserRequestDTO newUserRequestDTO) {
        if (newUserRequestDTO == null){
            return null;
        }
        return User.builder()
                .identificationType(newUserRequestDTO.getIdentificationType())
                .identificationNumber(newUserRequestDTO.getIdentificationNumber())
                .firstName(newUserRequestDTO.getFirstName())
                .lastName(newUserRequestDTO.getLastName())
                .emailAddress(newUserRequestDTO.getEmailAddress())
                .dateOfBirth(newUserRequestDTO.getDateOfBirth())
                .creationDate(newUserRequestDTO.getCreationDate())
                .modificationDate(newUserRequestDTO.getModificationDate())
                .build();
    }

    @Override
    public User toUser(UserUpdateRequestDTO updateUserRequestDTO) {
        if (updateUserRequestDTO == null){
            return null;
        }
        return User.builder()
                .id(updateUserRequestDTO.getId())
                .identificationType(updateUserRequestDTO.getIdentificationType())
                .identificationNumber(updateUserRequestDTO.getIdentificationNumber())
                .firstName(updateUserRequestDTO.getFirstName())
                .lastName(updateUserRequestDTO.getLastName())
                .emailAddress(updateUserRequestDTO.getEmailAddress())
                .dateOfBirth(updateUserRequestDTO.getDateOfBirth())
                .creationDate(updateUserRequestDTO.getCreationDate())
                .modificationDate(updateUserRequestDTO.getModificationDate())
                .build();
    }

    @Override
    public UserResponseDTO toUserResponseDto(User user) {
        if (user == null){
            return null;
        }
        UserResponseDTO userResponseDTO;
        userResponseDTO = new UserResponseDTO();
        userResponseDTO.setId(user.getId());
        userResponseDTO.setIdentificationType(user.getIdentificationType());
        userResponseDTO.setIdentificationNumber(user.getIdentificationNumber());
        userResponseDTO.setFirstName(user.getFirstName());
        userResponseDTO.setLastName(user.getLastName());
        userResponseDTO.setEmailAddress(user.getEmailAddress());
        userResponseDTO.setDateOfBirth(user.getDateOfBirth());
        userResponseDTO.setCreationDate(user.getCreationDate());
        userResponseDTO.setModificationDate(user.getModificationDate());
        return userResponseDTO;
    }
}
