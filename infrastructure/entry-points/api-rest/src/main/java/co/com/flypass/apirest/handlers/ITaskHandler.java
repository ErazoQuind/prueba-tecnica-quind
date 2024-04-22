package co.com.flypass.apirest.handlers;


import co.com.flypass.apirest.dtos.response.CustomTaskResponseDTO;

import java.time.LocalDate;

public interface ITaskHandler {
    CustomTaskResponseDTO getAllTasks(String sort);

    CustomTaskResponseDTO getAllTasksByCriteria(String status, LocalDate startDate, String assignedTo, String priority, String sort);
}
