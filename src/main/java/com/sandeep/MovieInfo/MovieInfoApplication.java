package com.sandeep.MovieInfo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.sandeep.MovieInfo.bean.Movie;
import com.sandeep.MovieInfo.repository.MovieRepository;

@SpringBootApplication
@EnableEurekaClient
public class MovieInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieInfoApplication.class, args);
	}
	
	@Bean
    public CommandLineRunner run(MovieRepository movieRepository) throws Exception {
        return (String[] args) -> {
            Movie movie1 = new Movie((long) 1,"Veer Zaara", "cast:srk,preety zinta");
            Movie movie2 = new Movie((long) 2,"Lakshya", "cast:HRK,preety zinta");
            Movie movie3 = new Movie((long) 3,"Border", "cast:Sunny Deol,unknown");
            Movie movie4 = new Movie((long) 4,"Lagaan", "cast:Amir,xyz");
            movieRepository.save(movie1);
            movieRepository.save(movie2);
            movieRepository.save(movie3);
            movieRepository.save(movie4);
            
        };
    }
}
