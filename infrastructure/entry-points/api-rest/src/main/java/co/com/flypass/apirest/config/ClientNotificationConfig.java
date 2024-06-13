package co.com.flypass.apirest.config;

import co.com.flypass.config.WebClientConfig;
import co.com.flypass.config.WebClientProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({WebClientConfig.class, WebClientProperties.class})
public class ClientNotificationConfig {
}
