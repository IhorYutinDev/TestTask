package com.space.repository;

import com.space.model.Ship;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipsRepository extends JpaRepository<Ship, Integer> {
}
