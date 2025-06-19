package com.java.SpringDataJpaDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.java.SpringDataJpaDateTime.dao.CustomerInfo;
import com.java.SpringDataJpaDateTime.service.CustomerServiceImp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
@SpringBootApplication
public class SpringDataJpaDateTimeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpaDateTimeApplication.class, args);
		CustomerServiceImp service = container.getBean(CustomerServiceImp.class);
		
		
//		CustomerInfo cus = new CustomerInfo("Ram",LocalDateTime.of(2008, 8, 3, 11, 28),LocalDate.now(),LocalTime.now());
//		System.out.println(service.registerCustomer(cus));
//		
		Iterable<CustomerInfo> list = service.getAllCustomerDetails();
		list.forEach(v->System.out.println(v));
	}

}
