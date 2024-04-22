package co.com.flypass.ports.inbound;

import co.com.flypass.models.Task;

import java.util.List;

public interface TaskUseCasePort {
    List<Task> getAllTasks();
}
