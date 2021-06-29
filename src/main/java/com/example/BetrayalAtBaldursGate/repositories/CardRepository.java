package com.example.BetrayalAtBaldursGate.repositories;
import com.example.BetrayalAtBaldursGate.cards.Card;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {
}
