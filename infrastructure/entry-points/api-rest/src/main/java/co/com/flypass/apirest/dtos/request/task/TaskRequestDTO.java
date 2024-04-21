package co.com.flypass.apirest.dtos.request.task;

import java.time.LocalDate;

public class TaskRequestDTO {
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
