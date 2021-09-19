package kettle.web_kettle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class WebKettleApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebKettleApplication.class, args);
    }

}
