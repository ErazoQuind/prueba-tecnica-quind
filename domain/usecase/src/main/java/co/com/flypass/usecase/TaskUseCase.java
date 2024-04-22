package co.com.flypass.usecase;

import co.com.flypass.models.Task;
import co.com.flypass.ports.inbound.TaskUseCasePort;
import co.com.flypass.ports.outbound.TaskRepositoryPort;

import java.util.List;


public class TaskUseCase implements TaskUseCasePort {
    private final TaskRepositoryPort taskRepositoryPort;

    public TaskUseCase(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public List<Task> getAllTasks() {
        return taskRepositoryPort.getAllTasks();
    }
}
