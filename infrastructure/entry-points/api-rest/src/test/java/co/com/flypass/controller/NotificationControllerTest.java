package co.com.flypass.controller;

import co.com.flypass.apirest.controllers.UserController;
import co.com.flypass.apirest.dtos.request.user.UserRequestDTO;
import co.com.flypass.apirest.dtos.request.user.UserUpdateRequestDTO;
import co.com.flypass.apirest.dtos.response.UserResponseDTO;
import co.com.flypass.apirest.handlers.IUserHandler;
import static org.assertj.core.api.Assertions.assertThat;

import co.com.flypass.constants.Constants;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = UserController.class)
class NotificationControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    private IUserHandler userHandler;

    @Test
    void testAddClientWithReturnedResponseAsObject() throws Exception {
        UserRequestDTO requestDTO = getClientRequestDTO();

        mockMvc.perform(post("/api/v1/client")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(asJsonString(requestDTO)))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.message").value(Constants.USER_CREATED_MESSAGE));

        verify(userHandler, times(1)).save(any(UserRequestDTO.class));
    }

    @Test
    void testUpdateClientWithReturnedSomeProperties() throws Exception {
        UserUpdateRequestDTO requestDTO = getClientUpdateRequestDTO();

        mockMvc.perform(put("/api/v1/client/update")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(asJsonString(requestDTO)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.message").value(Constants.USER_UPDATED_MESSAGE));


        verify(userHandler, times(1)).update(any(UserUpdateRequestDTO.class));
    }

    @Test
    void testDeleteClient() throws Exception {
        Long clientId = 1L;

        mockMvc.perform(delete("/api/v1/client/{clientId}", clientId))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.message").value(Constants.USER_DELETED_MESSAGE));
    }

    private String asJsonString(Object obj) {
        try {
            return objectMapper.writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    private static UserRequestDTO getClientRequestDTO() {
        UserRequestDTO notificationRequestDTO = new UserRequestDTO();
        notificationRequestDTO.setIdentificationType("prueba");
        notificationRequestDTO.setIdentificationNumber(1234567L);
        notificationRequestDTO.setFirstName("pruebaName");
        notificationRequestDTO.setLastName("1234567890");
        notificationRequestDTO.setEmailAddress("prueba@email.com");
        notificationRequestDTO.setDateOfBirth("12-04-2023");
        return notificationRequestDTO;
    }

    private static UserResponseDTO getClientResponseDTO() {
        UserResponseDTO clientResponse = new UserResponseDTO();
        clientResponse.setId(1L);
        clientResponse.setIdentificationType("DNI");
        clientResponse.setIdentificationNumber(123456789L);
        clientResponse.setFirstName("John");
        clientResponse.setLastName("Doe");
        clientResponse.setEmailAddress("johndoe@example.com");
        clientResponse.setDateOfBirth("1990-01-01");
        return clientResponse;
    }
    private static UserUpdateRequestDTO getClientUpdateRequestDTO() {
        UserUpdateRequestDTO clientUpdateRequest = new UserUpdateRequestDTO();
        clientUpdateRequest.setId(1L);
        clientUpdateRequest.setIdentificationType("DNI");
        clientUpdateRequest.setIdentificationNumber(123456789L);
        clientUpdateRequest.setFirstName("John");
        clientUpdateRequest.setLastName("Doe");
        clientUpdateRequest.setEmailAddress("johndoe@example.com");
        clientUpdateRequest.setDateOfBirth("1990-01-01");
        return clientUpdateRequest;
    }
}