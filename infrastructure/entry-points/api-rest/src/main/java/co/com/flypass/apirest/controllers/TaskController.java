package co.com.flypass.apirest.controllers;

import co.com.flypass.apirest.dtos.response.CustomTaskResponseDTO;
import co.com.flypass.apirest.handlers.ITaskHandler;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;


@RestController
@RequestMapping(value = "/api/v1/task")
@Validated
public class TaskController {
    private final ITaskHandler taskHandler;

    public TaskController(ITaskHandler taskHandler) {
        this.taskHandler = taskHandler;
    }

    @GetMapping
    public ResponseEntity<CustomTaskResponseDTO> getAllTasks(
            @Valid @Pattern(regexp = "ASC|DESC", message = "solo es permitido los valores 'ASC' o 'DESC'") @RequestParam(defaultValue = "ASC")  String sort
    ) {
        return ResponseEntity.ok(taskHandler.getAllTasks(sort));
    }

    @GetMapping("/filtered")
    public ResponseEntity<CustomTaskResponseDTO> getFilteredTasks(
            @RequestParam(required = false) String status,
            @RequestParam(required = false) LocalDate startDate,
            @RequestParam(required = false) String assignedTo,
            @RequestParam(required = false) String priority,
            @Valid @Pattern(regexp = "ASC|DESC", message = "solo es permitido los valores 'ASC' o 'DESC'") @RequestParam(defaultValue = "ASC")  String sort
    ) {
        return ResponseEntity.ok(taskHandler.getAllTasksByCriteria(status, startDate, assignedTo, priority, sort));
    }

}
