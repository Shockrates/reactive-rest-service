package com.example.reactiverestservice.Repositories;

import com.example.reactiverestservice.Models.CardModels.ArtistId;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistIdRepository extends JpaRepository<ArtistId, String>{
    
}
