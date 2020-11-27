package com.example.reactiverestservice.Repositories;

import com.example.reactiverestservice.Models.CardModels.Card;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, String>{
    
}
