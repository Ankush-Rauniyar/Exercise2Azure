package com.kdu.exerciseoneankush;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ExerciseoneankushApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExerciseoneankushApplication.class, args);
	}
	@RestController
	class HelloController {
		@GetMapping("/")
		public String index() {
			return "Hello, Ankush Rauniyar,KD-24 batch(FTP)";
		}
	}
}
