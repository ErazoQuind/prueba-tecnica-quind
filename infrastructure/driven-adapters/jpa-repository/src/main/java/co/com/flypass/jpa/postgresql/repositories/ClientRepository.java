package co.com.flypass.jpa.postgresql.repositories;


import co.com.flypass.jpa.postgresql.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClientRepository extends CrudRepository<UserEntity, Long> {

    List<UserEntity> findByIdentificationNumber(Long id);

}
