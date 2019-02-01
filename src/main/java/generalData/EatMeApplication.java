package generalData;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.*;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EatMeApplication {

    public static void main(String[] args) {
        SpringApplication.run(EatMeApplication.class, args);
    }

}
