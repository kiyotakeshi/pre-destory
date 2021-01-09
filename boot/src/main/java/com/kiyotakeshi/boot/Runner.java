package com.kiyotakeshi.boot;

import com.kiyotakeshi.boot.beans.Bean1;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Runner implements CommandLineRunner {

	private final Bean1 bean1;

	public Runner(Bean1 bean1) {
		this.bean1 = bean1;
	}

	public static void main(String[] args) {
		SpringApplication.run(Runner.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		bean1.sayHello();
	}
}
