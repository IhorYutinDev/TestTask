package com.space.service;

import com.space.model.Ship;

import java.util.List;

public interface ShipService {
    void create(Ship ship);
    List<Ship> readAll();

    Ship read(int id);

    boolean update(Ship ship, int id);

    boolean delete(int id);
}
