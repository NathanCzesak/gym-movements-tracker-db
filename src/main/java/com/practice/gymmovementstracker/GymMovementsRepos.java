package com.practice.gymmovementstracker;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GymMovementsRepos extends JpaRepository<GymMovements, Long> {
}
