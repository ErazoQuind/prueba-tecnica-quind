package co.com.flypass.ports.outbound;


import co.com.flypass.models.Task;

import java.util.List;

public interface TaskRepositoryPort {
    List<Task> getAllTasks();
}
