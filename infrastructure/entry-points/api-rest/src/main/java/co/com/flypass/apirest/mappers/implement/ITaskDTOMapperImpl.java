package co.com.flypass.apirest.mappers.implement;


import co.com.flypass.apirest.dtos.response.TaskResponseDTO;
import co.com.flypass.apirest.mappers.ITaskDTOMapper;
import co.com.flypass.models.Task;
import org.springframework.stereotype.Component;

@Component
public class ITaskDTOMapperImpl implements ITaskDTOMapper {

    @Override
    public TaskResponseDTO toTaskResponseDto(Task task) {
        TaskResponseDTO taskResponseDTO = new TaskResponseDTO();
        taskResponseDTO.setTaskCode(task.getTaskCode());
        taskResponseDTO.setAdditionDate(task.getAdditionDate());
        taskResponseDTO.setDescription(task.getDescription());
        taskResponseDTO.setStatus(task.getStatus());
        taskResponseDTO.setPriority(task.getPriority());
        taskResponseDTO.setStartDate(task.getStartDate());
        taskResponseDTO.setEndDate(task.getEndDate());
        taskResponseDTO.setComments(task.getComments());
        return taskResponseDTO;
    }
}
