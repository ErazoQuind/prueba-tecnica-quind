package co.com.flypass.jpa.postgresql.adapters;

import co.com.flypass.jpa.postgresql.mappers.ITaskEntityMapper;
import co.com.flypass.jpa.postgresql.repositories.TaskRepository;
import co.com.flypass.models.Task;
import co.com.flypass.ports.outbound.TaskRepositoryPort;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;


@Repository
@Transactional
public class TaskPostgresAdapter implements TaskRepositoryPort {
    private final TaskRepository taskRepository;
    private final ITaskEntityMapper taskEntityMapper;

    public TaskPostgresAdapter(TaskRepository taskRepository, ITaskEntityMapper taskEntityMapper) {
        this.taskRepository = taskRepository;
        this.taskEntityMapper = taskEntityMapper;
    }

    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAll().stream().map(taskEntityMapper::toTask).toList();
    }

    @Override
    public List<Task> getAllTasksByCriteria(String status, LocalDate startDate, String assignedTo, String priority, String sort) {
        return taskRepository.findByCriteria(status, startDate, assignedTo, priority, sort).stream().map(taskEntityMapper::toTask).toList();
    }

    @Override
    public void save(Task task) {
        taskRepository.save(taskEntityMapper.toTaskentity(task));
    }

    @Override
    public boolean existsById(String taskCode) {
        return taskRepository.existsById(taskCode);
    }


}
