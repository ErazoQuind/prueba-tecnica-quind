package co.com.flypass.jpa.postgresql.adapters;

import co.com.flypass.ports.outbound.TaskRepositoryPort;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public class TaskPostgresAdapter implements TaskRepositoryPort {

}
