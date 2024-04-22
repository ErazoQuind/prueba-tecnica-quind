package co.com.flypass.apirest.mappers.implement;


import co.com.flypass.apirest.dtos.request.task.TaskRequestDTO;
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
        taskResponseDTO.setAssignedPerson(task.getAssignedPerson());
        taskResponseDTO.setStatus(task.getStatus());
        taskResponseDTO.setPriority(task.getPriority());
        taskResponseDTO.setStartDate(task.getStartDate());
        taskResponseDTO.setEndDate(task.getEndDate());
        taskResponseDTO.setComments(task.getComments());
        return taskResponseDTO;
    }

    @Override
    public Task toTask(TaskRequestDTO taskRequestDTO) {
        Task task = new Task();
        task.setTaskCode(taskRequestDTO.getTaskCode());
        task.setAdditionDate(taskRequestDTO.getAdditionDate());
        task.setDescription(taskRequestDTO.getDescription());
        task.setAssignedPerson(taskRequestDTO.getAssignedPerson());
        task.setStatus(taskRequestDTO.getStatus());
        task.setPriority(taskRequestDTO.getPriority());
        task.setStartDate(taskRequestDTO.getStartDate());
        task.setEndDate(taskRequestDTO.getEndDate());
        task.setComments(taskRequestDTO.getComments());
        return task;
    }
}
