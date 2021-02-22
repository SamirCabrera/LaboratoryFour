package com.example.LabFour.Web.Config;

import com.example.LabFour.Repositories.Entities.MovieEntity;
import com.example.LabFour.Repositories.Interface.MoviesRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitDB {
    
    @Bean
    CommandLineRunner initDatabase(MoviesRepository repository) {

        return args -> {
            repository.save(new MovieEntity("Title 1", 2000L));
            repository.save(new MovieEntity("Title 2", 1000L));
        };
    }
}
