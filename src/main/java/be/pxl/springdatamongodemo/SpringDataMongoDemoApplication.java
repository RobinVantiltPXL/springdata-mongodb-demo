package be.pxl.springdatamongodemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class SpringDataMongoDemoApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(SpringDataMongoDemoApplication.class, args);
        Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "http://localhost:8081/swagger-ui/index.html");
    }

}
