package co.com.flypass.jpa.postgresql.mappers;

import co.com.flypass.jpa.postgresql.entities.UserEntity;
import co.com.flypass.models.User;

public interface IClientEntityMapper {
    User toUser(UserEntity userEntity);
    UserEntity toUserEntity(User user);
}
