package com.example.LabFour.Web.API;

import com.example.LabFour.Services.MoviesServices;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("movies/v1")
public class MoviesController {
    private final MoviesServices moviesServices;

    public MoviesController(MoviesServices moviesServices) {
        this.moviesServices = moviesServices;
    }

}
