package co.com.flypass.usecase;

import co.com.flypass.models.User;
import co.com.flypass.ports.inbound.UserUseCasePort;
import co.com.flypass.ports.outbound.UserRepositoryPort;


public class UserUseCase implements UserUseCasePort {

    private final UserRepositoryPort userRepositoryPort;


    public UserUseCase(UserRepositoryPort userRepositoryPort) {
        this.userRepositoryPort = userRepositoryPort;
    }

    public void save(User user) {
        userRepositoryPort.save(user);
    }

    public void update(User user) {
        userRepositoryPort.update(user);
    }

    public void deleteUserById(Long userId){
        userRepositoryPort.delete(userId);
    }
}
