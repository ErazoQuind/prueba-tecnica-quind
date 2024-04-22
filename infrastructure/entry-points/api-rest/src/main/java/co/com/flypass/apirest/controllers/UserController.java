package co.com.flypass.apirest.controllers;

import co.com.flypass.apirest.dtos.request.client.UserRequestDTO;
import co.com.flypass.apirest.dtos.request.client.UserUpdateRequestDTO;
import co.com.flypass.apirest.dtos.response.UserResponseDTO;
import co.com.flypass.apirest.handlers.IUserHandler;
import co.com.flypass.constants.Constants;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/v1/user", produces = MediaType.APPLICATION_JSON_VALUE)
@Validated
public class UserController {

    private final IUserHandler clientHandler;

    public UserController(IUserHandler clientHandler) {
        this.clientHandler = clientHandler;
    }

    @Operation(
            summary = "Crear un user",
            responses = {
                    @ApiResponse(responseCode = "201", description = "user creado",
                            content = @Content(mediaType = "application/json", schema = @Schema(implementation = UserResponseDTO.class, description = "respuesta de la solicitud"))),
                    @ApiResponse(responseCode = "422", description = "no se pudo procesar la operacion de guardar",
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Error")))
            })
    @PostMapping
    public ResponseEntity<Map<String,String>> add(@Valid @RequestBody UserRequestDTO userRequestDTO) {
        clientHandler.save(userRequestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(Collections.singletonMap(Constants.RESPONSE_MESSAGE_KEY,Constants.USER_CREATED_MESSAGE));
    }

    @Operation(summary = "actualizar user",
            responses = {
                    @ApiResponse(responseCode = "200", description = "client created",
                            content = @Content(mediaType = "application/json", schema = @Schema(implementation = UserResponseDTO.class, description = "respuesta de la solicitud"))),
                    @ApiResponse(responseCode = "422", description = "no se pudo procesar la operacion de actualizar",
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Error"))
                    )
            })
    @PutMapping(path = "/update")
    public ResponseEntity<Map<String,String>> update(@Valid @RequestBody UserUpdateRequestDTO userUpdateRequestDTO) {
        clientHandler.update(userUpdateRequestDTO);
        return ResponseEntity.status(HttpStatus.OK).body(Collections.singletonMap(Constants.RESPONSE_MESSAGE_KEY,Constants.USER_UPDATED_MESSAGE));
    }

    @Operation(summary = "Elimina un user por ID",
            parameters = {
                    @Parameter(name = "clientId", in = ParameterIn.PATH, required = true, description = "ID del user")
            },
            responses = {
                    @ApiResponse(responseCode = "200", description = "user eliminado",
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Map"))),
                    @ApiResponse(responseCode = "422", description = "no se pudo procesar la operacion de eliminado",
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Error"))
                    )
            })
    @DeleteMapping("{clientId}")
    public ResponseEntity<Map<String,String>> deleteUserById(@PathVariable Long clientId){
        clientHandler.deleteClientById(clientId);
        return ResponseEntity.status(HttpStatus.OK)
                .body(Collections.singletonMap(Constants.RESPONSE_MESSAGE_KEY,Constants.USER_DELETED_MESSAGE));
    }

}
