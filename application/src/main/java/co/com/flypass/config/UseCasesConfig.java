package co.com.flypass.config;


import co.com.flypass.ports.inbound.TaskUseCasePort;
import co.com.flypass.ports.outbound.UserRepositoryPort;
import co.com.flypass.ports.inbound.UserUseCasePort;
import co.com.flypass.ports.outbound.TaskRepositoryPort;
import co.com.flypass.usecase.UserUseCase;
import co.com.flypass.usecase.TaskUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCasesConfig {
        @Bean
        public UserUseCasePort clientUseCase(UserRepositoryPort userRepositoryPort){
                return new UserUseCase(userRepositoryPort);
        }

        @Bean
        public TaskUseCasePort taskUseCase(TaskRepositoryPort taskRepositoryPort){
                return new TaskUseCase(taskRepositoryPort);
        }
}
