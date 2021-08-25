package com.service.app;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiApplication.class, args);
	}
	
	@GetMapping
	public List<Empleado> hello()
	{
		return List.of(
				new Empleado(1, "Fabián", 20, 7000),
				new Empleado(2, "Marco", 34, 6500),
				new Empleado(3, "Jesus", 18, 4500),
				new Empleado(4, "Alberto", 60, 25000),
				new Empleado(5, "María", 28, 50000),
				new Empleado(6, "Sabrina", 22, 650000),
				new Empleado(7, "Debanhi", 38, 10000),
				new Empleado(8, "Mariana", 45, 5000),
				new Empleado(9, "Eliud", 63, 8000),
				new Empleado(10, "Jose", 76, 5000),
				new Empleado(11, "Jaime", 17, 7400),
				new Empleado(12, "Kevin", 68, 450000),
				new Empleado(13, "Alvarez", 90, 23000),
				new Empleado(14, "Cesar", 23, 12000),
				new Empleado(15, "Mauricio", 66, 52000)
				);
		
	}
}

