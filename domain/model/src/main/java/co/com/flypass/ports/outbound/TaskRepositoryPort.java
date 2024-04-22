package co.com.flypass.ports.outbound;


import co.com.flypass.models.Task;

import java.time.LocalDate;
import java.util.List;

public interface TaskRepositoryPort {
    List<Task> getAllTasks();

    List<Task> getAllTasksByCriteria(String status, LocalDate startDate, String assignedTo, String priority, String sort);

    void save(Task task);

    boolean existsById(String taskCode);
}
