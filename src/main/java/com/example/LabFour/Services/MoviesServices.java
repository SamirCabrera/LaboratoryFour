package com.example.LabFour.Services;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.LabFour.Repositories.Interface.MoviesRepository;

import org.modelmapper.ModelMapper;

public class MoviesServices {
    
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private MoviesRepository moviesRepository;

    
}
