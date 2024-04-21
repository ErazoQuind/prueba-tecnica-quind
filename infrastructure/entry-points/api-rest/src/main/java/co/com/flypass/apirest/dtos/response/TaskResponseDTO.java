package co.com.flypass.apirest.dtos.response;

import java.time.LocalDate;

public class TaskResponseDTO {
    private String taskCode;
    private LocalDate additionDate;
    private String description;
    private String assignedPerson;
    private String status;
    private String priority;
    private LocalDate startDate;
    private LocalDate endDate;
    private String comments;
}
