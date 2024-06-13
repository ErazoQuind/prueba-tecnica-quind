package co.com.flypass.jpa.postgresql.adapters;

import co.com.flypass.jpa.postgresql.mappers.IClientEntityMapper;
import co.com.flypass.jpa.postgresql.repositories.ClientRepository;
import co.com.flypass.models.User;
import co.com.flypass.ports.outbound.UserRepositoryPort;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public class UserPostgresAdapter implements UserRepositoryPort {
    private final ClientRepository clientRepository;
    private final IClientEntityMapper clientEntityMapper;

    public UserPostgresAdapter(ClientRepository clientRepository, IClientEntityMapper clientEntityMapper) {
        this.clientRepository = clientRepository;
        this.clientEntityMapper = clientEntityMapper;
    }


    @Override
    public void save(User user) {
        clientRepository.save(clientEntityMapper.toUserEntity(user));
    }

    @Override
    public void update(User user) {
        clientRepository.save(clientEntityMapper.toUserEntity(user));
    }

    @Override
    public void delete(Long clientId) {
        clientRepository.deleteById(clientId);
    }
}
