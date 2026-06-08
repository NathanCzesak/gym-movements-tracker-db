package com.practice.gymmovementstracker;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GymMovementsService {

    private final GymMovementsRepos repos;
    public GymMovementsService(GymMovementsRepos repos) {
        this.repos = repos;
    }

    public List<GymMovements> getMovements() {
        return repos.findAll();
    }

    public void addMovement(GymMovements gymMovements) {
        repos.save(gymMovements);
    }

    public void deleteMovement(Long id) {
        if(!repos.existsById(id)){
            throw new RuntimeException("Gym Movement with id " + id + " does not exist");
        }
        repos.deleteById(id);
    }

}
