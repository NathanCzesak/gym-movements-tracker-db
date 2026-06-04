package com.practice.gymmovementstracker;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gym-movements")
public class GymMovementsController {

    private final GymMovementsRepos repos;
    public GymMovementsController(GymMovementsRepos repos) {
        this.repos = repos;
    }

    @GetMapping
    public List<GymMovements> getMovements() {
        return repos.findAll();
    }

    @PostMapping
    public void addMovement(@RequestBody GymMovements gymMovement) {
        repos.save(gymMovement);
    }

    @DeleteMapping("/{id}")
    public void deleteMovement(@PathVariable Long id) {
        repos.deleteById(id);
    }

}
