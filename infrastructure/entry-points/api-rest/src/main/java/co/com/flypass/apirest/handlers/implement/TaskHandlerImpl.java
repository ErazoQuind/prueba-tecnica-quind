package co.com.flypass.apirest.handlers.implement;

import co.com.flypass.apirest.dtos.request.task.TaskRequestDTO;
import co.com.flypass.apirest.dtos.response.CustomTaskResponseDTO;
import co.com.flypass.apirest.dtos.response.TaskResponseDTO;
import co.com.flypass.apirest.handlers.ITaskHandler;
import co.com.flypass.apirest.mappers.ITaskDTOMapper;
import co.com.flypass.constants.Constants;
import co.com.flypass.ports.inbound.TaskUseCasePort;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;


@Service
public class TaskHandlerImpl implements ITaskHandler {
    private final TaskUseCasePort taskUseCase;
    private final ITaskDTOMapper taskDTOMapper;

    public TaskHandlerImpl(TaskUseCasePort taskUseCase, ITaskDTOMapper taskDTOMapper) {
        this.taskUseCase = taskUseCase;
        this.taskDTOMapper = taskDTOMapper;
    }

    @Override
    public CustomTaskResponseDTO getAllTasks(String sort) {
        CustomTaskResponseDTO response = new CustomTaskResponseDTO();
        List<TaskResponseDTO> taskResponseDTOList = taskUseCase.getAllTasks().stream().map(taskDTOMapper::toTaskResponseDto).toList();
        if (sort.equals("DESC")) {
            Comparator<TaskResponseDTO> comparator = Comparator.comparing(TaskResponseDTO::getAdditionDate).reversed();
            taskResponseDTOList = taskResponseDTOList.stream().sorted(comparator).toList();
        }

        response.setTaskResponseDTOList(taskResponseDTOList);
        response.setMessage(Constants.SUCCESSFUL_REQUEST);

        return response;
    }

    @Override
    public CustomTaskResponseDTO getAllTasksByCriteria(String status, LocalDate startDate, String assignedTo, String priority, String sort) {
        CustomTaskResponseDTO response = new CustomTaskResponseDTO();
        List<TaskResponseDTO> taskResponseDTOList = taskUseCase.getAllTasksByCriteria(status,startDate,assignedTo,priority,sort).stream().map(taskDTOMapper::toTaskResponseDto).toList();
        response.setTaskResponseDTOList(taskResponseDTOList);
        response.setMessage(Constants.SUCCESSFUL_REQUEST);
        return response;
    }

    @Override
    public void createTask(TaskRequestDTO taskRequestDTO) {
        taskUseCase.createTask(taskDTOMapper.toTask(taskRequestDTO));
    }

    @Override
    public void updateTask(TaskRequestDTO taskRequestDTO) {
        taskUseCase.updateTask(taskDTOMapper.toTask(taskRequestDTO));
    }
}
