package com.example.BetrayalAtBaldursGate.repositories;

import com.example.BetrayalAtBaldursGate.tiles.StreetTile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreetTileRepository extends JpaRepository<StreetTile, Long> {
}
