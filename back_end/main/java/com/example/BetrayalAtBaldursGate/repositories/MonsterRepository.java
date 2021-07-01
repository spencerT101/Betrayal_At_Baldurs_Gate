package com.example.BetrayalAtBaldursGate.repositories;

import com.example.BetrayalAtBaldursGate.characters.Monster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonsterRepository extends JpaRepository<Monster, Long> {

}
