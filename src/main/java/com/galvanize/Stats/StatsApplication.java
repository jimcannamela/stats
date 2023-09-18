package com.galvanize.Stats;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StatsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StatsApplication.class, args);
	}


	// Component that will get loaded by Spring
	private final Seeder seeder;

	// The input parameter seeder is provided to this constructor via
	//   Dependency Injection (DI) in Spring.
	public StatsApplication(Seeder seeder) {
		this.seeder = seeder;
		this.seeder.loadStats(); // We can call method in the constructor
	}
}