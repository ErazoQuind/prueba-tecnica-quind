package co.com.flypass.apirest.mappers.implement;


import co.com.flypass.apirest.dtos.response.TaskResponseDTO;
import co.com.flypass.apirest.mappers.ITaskDTOMapper;
import co.com.flypass.models.Task;
import org.springframework.stereotype.Component;

@Component
public class ITaskDTOMapperImpl implements ITaskDTOMapper {

    @Override
    public TaskResponseDTO toTaskResponseDto(Task task) {
        return null;
    }
}
