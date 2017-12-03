package com.jiahua.myabbreviation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jiahua.myabbreviation.entity.Abbre;
import com.jiahua.myabbreviation.repository.AbbreRepository;

@SpringBootApplication
@Controller
public class MyAbbreviationApplication {
	private static final Logger log = LoggerFactory.getLogger(MyAbbreviationApplication.class);
	
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
	public static void main(String[] args) {
		SpringApplication.run(MyAbbreviationApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(AbbreRepository repository) {
		return (args) -> {
			// save a couple of customers
			repository.save(new Abbre("BIN","Bank Identification Number","Airlines"));


			// fetch all customers
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			for (Abbre abbre : repository.findAll()) {
				log.info(abbre.toString());
			}
			log.info("");

			// fetch an individual customer by ID
//			Abbre customer = repository.findById("");
//			log.info("Customer found with findOne(1L):");
//			log.info("--------------------------------");
//			log.info(customer.toString());
//			log.info("");
//
//			// fetch customers by last name
//			log.info("Customer found with findByLastName('Bauer'):");
//			log.info("--------------------------------------------");
//			for (Customer bauer : repository.findByLastName("Bauer")) {
//				log.info(bauer.toString());
//			}
			log.info("");
		};
	}
	
	
}
