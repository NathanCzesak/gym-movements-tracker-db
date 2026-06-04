package com.practice.gymmovementstracker;

import jakarta.persistence.*;

@Entity
@Table(name = "movements")
public class GymMovements {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String muscleGroup;
    private double rating;

    public GymMovements(){}
    public GymMovements(String name, String muscleGroup, double rating) {
        this.name = name;
        this.muscleGroup = muscleGroup;
        this.rating = rating;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getMuscleGroup() {
        return muscleGroup;
    }

    public void setMuscleGroup(String muscleGroup) {
        this.muscleGroup = muscleGroup;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
