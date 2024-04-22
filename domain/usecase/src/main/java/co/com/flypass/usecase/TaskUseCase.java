package co.com.flypass.usecase;

import co.com.flypass.constants.Constants;
import co.com.flypass.exception.AlreadyExistException;
import co.com.flypass.exception.NotFoundException;
import co.com.flypass.models.Task;
import co.com.flypass.ports.inbound.TaskUseCasePort;
import co.com.flypass.ports.outbound.TaskRepositoryPort;

import java.time.LocalDate;
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

    @Override
    public List<Task> getAllTasksByCriteria(String status, LocalDate startDate, String assignedTo, String priority, String sort) {
        return taskRepositoryPort.getAllTasksByCriteria(status,startDate,assignedTo,priority,sort);
    }

    @Override
    public void createTask(Task task) {
        if (taskRepositoryPort.existsById(task.getTaskCode())){
            throw new AlreadyExistException(Constants.TASK_EXIST_MESSAGE, Constants.TASK_EXIST_MESSAGE);
        }
        taskRepositoryPort.save(task);
    }

    @Override
    public void updateTask(Task task) {
        if (!taskRepositoryPort.existsById(task.getTaskCode())){
            throw new NotFoundException(Constants.TASK_NOT_FOUND_MESSAGE, Constants.TASK_NOT_FOUND_MESSAGE);
        }
        taskRepositoryPort.save(task);
    }
}
