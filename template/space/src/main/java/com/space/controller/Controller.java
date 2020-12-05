package com.space.controller;

import com.space.model.Ship;
import com.space.service.ShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    private final ShipService shipService;

    @Autowired
    public Controller(ShipService shipService) {
        this.shipService = shipService;
    }

    @GetMapping(value = "rest/ships")
    public ResponseEntity<List<Ship>> read() {
        final List<Ship> ships = shipService.readAll();

        return ships != null && !ships.isEmpty()
                ? new ResponseEntity<>(ships, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
