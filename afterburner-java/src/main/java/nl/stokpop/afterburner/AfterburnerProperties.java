package nl.stokpop.afterburner;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "afterburner")
@ConstructorBinding
@Data
public class AfterburnerProperties {

    @Value("${spring.application.name}")
    String name = "Afterburner";
    String databaseConnectQuery = "SELECT 1";

    int asyncMaxPoolSize = 10;
    int asyncCorePoolSize = 5;
    int asyncQueueSize = -1;
    int asyncKeepAliveSeconds = 60;

}
