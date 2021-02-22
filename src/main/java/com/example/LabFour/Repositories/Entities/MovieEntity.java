package com.example.LabFour.Repositories.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Movies")
@Entity(name = "Movies")
public class MovieEntity {
    
    private @Id @GeneratedValue Long id;
    private String title;
    private Long year;

    public MovieEntity() {
    }

    public MovieEntity(String title, Long year) {
        this.title = title;
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getYear() {
        return year;
    }

    public void setYear(Long year) {
        this.year = year;
    }

    
}
