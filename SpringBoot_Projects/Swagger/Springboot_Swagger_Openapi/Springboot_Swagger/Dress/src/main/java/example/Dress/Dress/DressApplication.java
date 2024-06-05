package example.Dress.Dress;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@SpringBootApplication
public class DressApplication {

	public static void main(String[] args) {
		SpringApplication.run(DressApplication.class, args);
	}
}
