package ar.springtask.demo.springcloudtask;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;

@SpringBootApplication
@EnableTask
public class SpringcloudtaskApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudtaskApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello World" +args[0]);
		
	}

}
