package net.javaguides.sms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"net.javaguides.sms"})
public class StudentManegementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentManegementSystemApplication.class, args);
		
	}

}
