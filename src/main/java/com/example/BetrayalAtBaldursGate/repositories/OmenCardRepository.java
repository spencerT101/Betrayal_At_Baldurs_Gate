package com.example.BetrayalAtBaldursGate.repositories;

import com.example.BetrayalAtBaldursGate.cards.OmenCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OmenCardRepository extends JpaRepository<OmenCard, Long> {
}
