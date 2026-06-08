package com.practice.gymmovementstracker;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gym-movements")
public class GymMovementsController {

    private final GymMovementsRepos repos;
    private final GymMovementsService gymMovementsService;

    public GymMovementsController(GymMovementsRepos repos, GymMovementsService gymMovementsService) {
        this.repos = repos;
        this.gymMovementsService = gymMovementsService;
    }

    @GetMapping
    public List<GymMovements> getMovements() {
        return gymMovementsService.getMovements();
    }

    @PostMapping
    public void addMovement(@RequestBody GymMovements gymMovement) {
        gymMovementsService.addMovement(gymMovement);
    }

    @DeleteMapping("/{id}")
    public void deleteMovement(@PathVariable Long id) {
        gymMovementsService.deleteMovement(id);
    }

}
