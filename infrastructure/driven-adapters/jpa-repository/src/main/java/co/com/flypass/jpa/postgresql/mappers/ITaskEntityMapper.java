package co.com.flypass.jpa.postgresql.mappers;

import co.com.flypass.jpa.postgresql.entities.TaskEntity;
import co.com.flypass.models.Task;

public interface ITaskEntityMapper {
    Task toTask(TaskEntity taskEntity);
}
