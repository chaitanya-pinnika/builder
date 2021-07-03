package com.pinnika.builder;

import com.pinnika.builder.builders.Employee;
import com.pinnika.builder.builders.Student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BuilderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuilderApplication.class, args);
		System.out.println("creating Employee object");
		Employee employee1 = new Employee.EmployeeBuilder("Venkata", "Pinnika", 25, 12345).build();
		System.out.println(employee1);
		Employee employee2 = new Employee.EmployeeBuilder("Chaitanya", "Pinnika", 24, 234)
											.withAddress("1622 Homesteaf Trail")
											.withMail("venkata.pinnika@hcl.com")
											.build();
		System.out.println(employee2);
		Student student1 = Student.builder().
										firstName("Henry").lastName("Zhang").build();
		System.out.println(student1);
	}

}
