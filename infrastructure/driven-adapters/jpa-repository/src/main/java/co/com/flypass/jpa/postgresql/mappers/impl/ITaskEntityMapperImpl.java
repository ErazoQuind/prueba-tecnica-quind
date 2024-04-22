package co.com.flypass.jpa.postgresql.mappers.impl;

import co.com.flypass.jpa.postgresql.entities.TaskEntity;
import co.com.flypass.jpa.postgresql.mappers.ITaskEntityMapper;
import co.com.flypass.models.Task;
import org.springframework.stereotype.Component;

@Component
public class ITaskEntityMapperImpl implements ITaskEntityMapper {
    @Override
    public Task toTask(TaskEntity taskEntity) {
        Task task = new Task();
        task.setTaskCode(taskEntity.getTaskCode());
        task.setAdditionDate(taskEntity.getAdditionDate());
        task.setAssignedPerson(taskEntity.getAssignedPerson());
        task.setDescription(taskEntity.getDescription());
        task.setStatus(taskEntity.getStatus());
        task.setPriority(taskEntity.getPriority());
        task.setStartDate(taskEntity.getStartDate());
        task.setEndDate(taskEntity.getEndDate());
        task.setComments(taskEntity.getComments());
        return task;
    }

    @Override
    public TaskEntity toTaskentity(Task task) {
        TaskEntity taskEntity = new TaskEntity();
        taskEntity.setTaskCode(task.getTaskCode());
        taskEntity.setAdditionDate(task.getAdditionDate());
        taskEntity.setDescription(task.getDescription());
        taskEntity.setAssignedPerson(task.getAssignedPerson());
        taskEntity.setStatus(task.getStatus());
        taskEntity.setPriority(task.getPriority());
        taskEntity.setStartDate(task.getStartDate());
        taskEntity.setEndDate(task.getEndDate());
        taskEntity.setComments(task.getComments());
        return taskEntity;
    }
}
