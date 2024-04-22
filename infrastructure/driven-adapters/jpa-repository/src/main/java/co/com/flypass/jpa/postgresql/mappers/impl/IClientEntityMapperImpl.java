package co.com.flypass.jpa.postgresql.mappers.impl;

import co.com.flypass.jpa.postgresql.entities.UserEntity;
import co.com.flypass.jpa.postgresql.mappers.IClientEntityMapper;
import co.com.flypass.models.User;
import org.springframework.stereotype.Component;

@Component
public class IClientEntityMapperImpl implements IClientEntityMapper {
    @Override
    public User toUser(UserEntity userEntity) {
        if (userEntity == null){
            return null;
        }
        return User.builder()
                .id(userEntity.getId())
                .identificationType(userEntity.getIdentificationType())
                .identificationNumber(userEntity.getIdentificationNumber())
                .firstName(userEntity.getFirstName())
                .lastName(userEntity.getLastName())
                .emailAddress(userEntity.getEmailAddress())
                .dateOfBirth(userEntity.getDateOfBirth())
                .creationDate(userEntity.getCreationDate())
                .modificationDate(userEntity.getModificationDate())
                .build();
    }

    @Override
    public UserEntity toUserEntity(User user) {
        if (user == null){
            return null;
        }
        UserEntity userEntity;
        userEntity = new UserEntity();
        userEntity.setId(user.getId());
        userEntity.setIdentificationType(user.getIdentificationType());
        userEntity.setIdentificationNumber(user.getIdentificationNumber());
        userEntity.setFirstName(user.getFirstName());
        userEntity.setLastName(user.getLastName());
        userEntity.setEmailAddress(user.getEmailAddress());
        userEntity.setDateOfBirth(user.getDateOfBirth());
        userEntity.setCreationDate(user.getCreationDate());
        userEntity.setModificationDate(user.getModificationDate());
        return userEntity;
    }
}
