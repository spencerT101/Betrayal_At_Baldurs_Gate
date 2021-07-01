package com.example.BetrayalAtBaldursGate.repositories;

import com.example.BetrayalAtBaldursGate.cards.ItemCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemCardRepository extends JpaRepository<ItemCard, Long> {
}
