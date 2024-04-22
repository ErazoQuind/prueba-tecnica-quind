package co.com.flypass.apirest.mappers;


import co.com.flypass.apirest.dtos.response.TaskResponseDTO;
import co.com.flypass.models.Task;

public interface ITaskDTOMapper {
    TaskResponseDTO toTaskResponseDto(Task task);
}
