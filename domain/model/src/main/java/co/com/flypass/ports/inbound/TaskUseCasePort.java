package co.com.flypass.ports.inbound;

import co.com.flypass.models.Task;

import java.time.LocalDate;
import java.util.List;

public interface TaskUseCasePort {
    List<Task> getAllTasks();

    List<Task> getAllTasksByCriteria(String status, LocalDate startDate, String assignedTo, String priority, String sort);
}
