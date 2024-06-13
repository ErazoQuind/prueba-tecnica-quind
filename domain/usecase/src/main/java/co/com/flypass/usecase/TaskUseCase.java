package co.com.flypass.usecase;

import co.com.flypass.constants.Constants;
import co.com.flypass.exception.AlreadyExistException;
import co.com.flypass.exception.NotFoundException;
import co.com.flypass.models.Task;
import co.com.flypass.ports.inbound.TaskUseCasePort;
import co.com.flypass.ports.outbound.TaskRepositoryPort;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;


public class TaskUseCase implements TaskUseCasePort {
    private final TaskRepositoryPort taskRepositoryPort;

    public TaskUseCase(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public List<Task> getAllTasks(String sort) {
        List<Task> tasks = taskRepositoryPort.getAllTasks();
        tasks = sortDescendentList(sort, tasks);
        return tasks;
    }

    @Override
    public List<Task> getAllTasksByCriteria(String status, LocalDate startDate, String assignedTo, String priority, String sort) {
        return taskRepositoryPort.getAllTasksByCriteria(status,startDate,assignedTo,priority,sort);
    }

    @Override
    public void createTask(Task task) {
        validateExistTask(task);
        taskRepositoryPort.save(task);
    }

    @Override
    public void updateTask(Task task) {
        validateNotExistTask(task);
        taskRepositoryPort.save(task);
    }


    private List<Task> sortDescendentList(String sort, List<Task> tasks) {
        if (sort.equals("DESC")) {
            Comparator<Task> comparator = Comparator.comparing(Task::getAdditionDate).reversed();
            tasks = tasks.stream().sorted(comparator).toList();
        }
        return tasks;
    }

    private void validateExistTask(Task task) {
        if (taskRepositoryPort.existsById(task.getTaskCode())){
            throw new AlreadyExistException(Constants.TASK_EXIST_MESSAGE, Constants.TASK_EXIST_MESSAGE);
        }
    }

    private void validateNotExistTask(Task task) {
        if (!taskRepositoryPort.existsById(task.getTaskCode())){
            throw new NotFoundException(Constants.TASK_NOT_FOUND_MESSAGE, Constants.TASK_NOT_FOUND_MESSAGE);
        }
    }
}
