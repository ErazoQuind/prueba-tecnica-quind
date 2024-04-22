package co.com.flypass.config;


import co.com.flypass.ports.inbound.TaskUseCasePort;
import co.com.flypass.ports.outbound.ClientRepositoryPort;
import co.com.flypass.ports.inbound.ClientUseCasePort;
import co.com.flypass.ports.outbound.TaskRepositoryPort;
import co.com.flypass.usecase.ClientUseCase;
import co.com.flypass.usecase.TaskUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCasesConfig {
        @Bean
        public ClientUseCasePort clientUseCase(ClientRepositoryPort clientRepositoryPort){
                return new ClientUseCase(clientRepositoryPort);
        }

        @Bean
        public TaskUseCasePort taskUseCase(TaskRepositoryPort taskRepositoryPort){
                return new TaskUseCase(taskRepositoryPort);
        }
}
