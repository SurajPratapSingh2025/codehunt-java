package com.mainapp;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages= {"com.mainapp"})
@PropertySource("classpath:config.properties")
public class MyConfiguration {
	
	@Autowired
	private Environment environment;
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
//		driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/spsdb");
//		driverManagerDataSource.setUsername("root");
//		driverManagerDataSource.setPassword("root");
//		driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		driverManagerDataSource.setUrl(environment.getProperty("db.url"));
		driverManagerDataSource.setUsername(environment.getProperty("db.username"));
		driverManagerDataSource.setPassword(environment.getProperty("db.password"));
		driverManagerDataSource.setDriverClassName(environment.getProperty("db.driver"));
		return driverManagerDataSource;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(dataSource());
	}
	
	@Bean("crud")
	public Crud crud() {
		Crud crud = new Crud();
		crud.setJdbcTemplate(jdbcTemplate());
		return crud;
	}
	
	
	
	
}