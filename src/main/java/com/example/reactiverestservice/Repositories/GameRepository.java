package com.example.reactiverestservice.Repositories;

import com.example.reactiverestservice.Models.CardModels.Game;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Integer>{
    
}
