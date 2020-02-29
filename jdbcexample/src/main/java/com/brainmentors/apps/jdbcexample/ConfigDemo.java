package com.brainmentors.apps.jdbcexample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration

@ComponentScan("com.brainmentors")
public class ConfigDemo {
	//@Bean("ds")
	DriverManagerDataSource getConnection(){
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setUsername("root");
		ds.setPassword("amit123456");
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		System.out.println("Connection Created...");
		return ds;
	}
	@Bean("jdbcTemplate")
	JdbcTemplate getTemplate() {
		JdbcTemplate j= new JdbcTemplate();
		j.setDataSource(getConnection());
		return j;
	}
	@Bean("namedJdbcTemplate")
	NamedParameterJdbcTemplate getNamedTemplate() {
		NamedParameterJdbcTemplate j= new NamedParameterJdbcTemplate(getConnection());
		
		return j;
	}
}
