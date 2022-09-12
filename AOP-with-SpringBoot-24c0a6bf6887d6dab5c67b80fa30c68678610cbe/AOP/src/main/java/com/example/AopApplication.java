package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.business.Business1;
import com.example.business.Business2;

@SpringBootApplication
public class AopApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private Business1 business1;

	@Autowired
	private Business2 business2;

	public static void main(String[] args) {
		SpringApplication.run(AopApplication.class, args);
	}

	// Command Line methods to execute the program
	@Override
	public void run(String... args) throws Exception {
		logger.info(business1.calculateSomething());
		logger.info(business2.calculateSomething());

	}

}
