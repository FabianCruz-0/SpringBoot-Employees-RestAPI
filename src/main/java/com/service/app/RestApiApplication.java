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
		Empleado em1 = new Empleado(1, "Fabián", 20, 7000);
		Empleado em2 =new Empleado(2, "Marco", 34, 6500);
		Empleado em3= new Empleado(3, "Jesus", 18, 4500);
		Empleado em4= new Empleado(4, "Alberto", 60, 25000);
		Empleado em5=new Empleado(5, "María", 28, 50000);
		Empleado em6=new Empleado(6, "Sabrina", 22, 650000);
		Empleado em7=new Empleado(7, "Debanhi", 38, 10000);
		Empleado em8=new Empleado(8, "Mariana", 45, 5000);
		Empleado em9=new Empleado(9, "Eliud", 63, 8000);
		Empleado em10=new Empleado(10, "Jose", 76, 5000);
		Empleado em11=new Empleado(11, "Jaime", 17, 7400);
		Empleado em12=new Empleado(12, "Kevin", 68, 450000);
		Empleado em13=new Empleado(13, "Alvarez", 90, 23000);
		Empleado em14=new Empleado(14, "Cesar", 23, 12000);
		Empleado em15=new Empleado(15, "Mauricio", 66, 52000);
		return List.of(em1,em2,em3,em4,em5,em6,em7,em8,em9,em10,em11,em12,em12,em13,em14,em15);
	}
}

