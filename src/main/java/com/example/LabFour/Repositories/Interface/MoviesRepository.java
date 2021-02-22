package com.example.LabFour.Repositories.Interface;

import com.example.LabFour.Repositories.Entities.MovieEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MoviesRepository extends JpaRepository<MovieEntity, Long> {
    
}
