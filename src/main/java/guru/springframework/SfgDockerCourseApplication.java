package guru.springframework;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class SfgDockerCourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SfgDockerCourseApplication.class, args);
	}
}
