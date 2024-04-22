package co.com.flypass.apirest.controllers;

import co.com.flypass.apirest.dtos.response.CustomTaskResponseDTO;
import co.com.flypass.apirest.dtos.response.TaskResponseDTO;
import co.com.flypass.apirest.handlers.ITaskHandler;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/task")
@Validated
public class TaskController {
    private final ITaskHandler taskHandler;

    public TaskController(ITaskHandler taskHandler) {
        this.taskHandler = taskHandler;
    }

    @GetMapping
    public ResponseEntity<CustomTaskResponseDTO> getAllTasks() {
        return ResponseEntity.ok(taskHandler.getAllTasks());
    }

}
