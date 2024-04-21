package co.com.flypass.jpa.postgresql.repositories;


import co.com.flypass.jpa.postgresql.entities.TaskEntiy;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<TaskEntiy, String> {

}
