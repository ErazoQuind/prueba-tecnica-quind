package co.com.flypass.apirest.handlers;


import co.com.flypass.apirest.dtos.response.CustomTaskResponseDTO;

public interface ITaskHandler {
    CustomTaskResponseDTO getAllTasks();
}
