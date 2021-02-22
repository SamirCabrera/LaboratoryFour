package com.example.LabFour.Web.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.LabFour.Services.MoviesServices;

import org.modelmapper.ModelMapper;

@Configuration
public class DI {
    
    @Bean
    ModelMapper createModelMapper() {
        return new ModelMapper();
    }

    @Bean
    MoviesServices createMoviesServices() {
        return new MoviesServices();
    }
}
