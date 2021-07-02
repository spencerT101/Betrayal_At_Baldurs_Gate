package com.example.BetrayalAtBaldursGate.repositories;

import com.example.BetrayalAtBaldursGate.characters.Hero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface TestRepository extends JpaRepository<Hero, Long> {
}
