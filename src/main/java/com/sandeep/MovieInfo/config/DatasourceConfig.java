package com.sandeep.MovieInfo.config;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages="com.sandeep.MovieInfo.repository")
@EnableTransactionManagement
public class DatasourceConfig {

	    @Bean
	    public DataSource getDataSource() {
	        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
	        dataSourceBuilder.driverClassName("org.h2.Driver");
	        dataSourceBuilder.url("jdbc:h2:mem:test");
	        dataSourceBuilder.username("SA");
	        dataSourceBuilder.password("");
	        return dataSourceBuilder.build();
	    }
}
