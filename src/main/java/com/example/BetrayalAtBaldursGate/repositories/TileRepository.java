package com.example.BetrayalAtBaldursGate.repositories;

import com.example.BetrayalAtBaldursGate.tiles.Tile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TileRepository extends JpaRepository<Tile, Long> {
}
