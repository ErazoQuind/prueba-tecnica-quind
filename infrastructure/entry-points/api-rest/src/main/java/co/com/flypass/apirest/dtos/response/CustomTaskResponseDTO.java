package co.com.flypass.apirest.dtos.response;

import java.util.List;

public class CustomTaskResponseDTO {
    private List<TaskResponseDTO> taskResponseDTOList;
    private String message;

    public CustomTaskResponseDTO() {
    }

    public CustomTaskResponseDTO(List<TaskResponseDTO> taskResponseDTOList, String message) {
        this.taskResponseDTOList = taskResponseDTOList;
        this.message = message;
    }

    public List<TaskResponseDTO> getTaskResponseDTOList() {
        return taskResponseDTOList;
    }

    public void setTaskResponseDTOList(List<TaskResponseDTO> taskResponseDTOList) {
        this.taskResponseDTOList = taskResponseDTOList;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
