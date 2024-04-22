package co.com.flypass.jpa.postgresql.mappers.impl;

import co.com.flypass.jpa.postgresql.entities.TaskEntity;
import co.com.flypass.jpa.postgresql.mappers.ITaskEntityMapper;
import co.com.flypass.models.Task;
import org.springframework.stereotype.Component;

@Component
public class ITaskEntityMapperImpl implements ITaskEntityMapper {
    @Override
    public Task toTask(TaskEntity taskEntity) {
        return null;
    }
}
