package co.com.flypass.jpa.postgresql.repositories;


import co.com.flypass.jpa.postgresql.entities.TaskEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface TaskRepository extends ListCrudRepository<TaskEntity, String> {

    @Query(value = "SELECT * FROM Task t WHERE " +
            "(:status IS NULL OR t.status = :status) AND " +
            "(:startDate IS NULL OR t.start_date = :startDate) AND " +
            "(:assignedTo IS NULL OR t.assigned_person = :assignedTo) AND " +
            "(:priority IS NULL OR t.priority = :priority) " +
            "ORDER BY CASE WHEN :sort = 'DESC' THEN t.addition_date END DESC, " +
            "         CASE WHEN :sort = 'ASC' THEN t.addition_date END ASC",
            nativeQuery = true)
    List<TaskEntity> findByCriteria(
            @Param("status") String status,
            @Param("startDate") LocalDate startDate,
            @Param("assignedTo") String assignedTo,
            @Param("priority") String priority,
            @Param("sort") String sort
    );
}
