package dev.wg.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MoviesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(MoviesApplication.class, args);
	}

}
