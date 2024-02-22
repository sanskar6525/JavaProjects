package com.sanskar.SpringJDBCDemo;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sanskar.SpringJDBCDemo.model.DataBase;
import com.sanskar.SpringJDBCDemo.repo.DAO;

@SpringBootApplication
public class SpringJdbcDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringJdbcDemoApplication.class, args);
		DataBase db=context.getBean(DataBase.class);
		db.setId(04);
		db.setName("Sanskar");
		db.setRole("Java");
		
		DAO d=context.getBean(DAO.class);
		d.save(db);
		ArrayList<DataBase> List=(ArrayList<DataBase>) d.findAll();
		System.out.println(List);
		
		
	}

}



