package com.example.BetrayalAtBaldursGate.repositories;

import com.example.BetrayalAtBaldursGate.tiles.BuildingTile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuildingTileRepository extends JpaRepository<BuildingTile, Long> {
}
