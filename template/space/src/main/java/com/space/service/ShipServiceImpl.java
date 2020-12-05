package com.space.service;

import com.space.model.Ship;
import com.space.repository.ShipsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShipServiceImpl implements ShipService {
    @Autowired
    private ShipsRepository shipsRepository;

    @Override
    public void create(Ship ship) {
        shipsRepository.save(ship);
    }

    @Override
    public List<Ship> readAll() {
        return shipsRepository.findAll();
    }

    @Override
    public Ship read(int id) {
        return shipsRepository.getOne(id);
    }

    @Override
    public boolean update(Ship ship, int id) {
        if (shipsRepository.existsById(id)) {
            ship.setId(id);
            shipsRepository.save(ship);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        if (shipsRepository.existsById(id)) {
            shipsRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
