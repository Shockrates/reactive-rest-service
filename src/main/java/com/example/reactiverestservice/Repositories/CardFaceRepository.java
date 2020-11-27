package com.example.reactiverestservice.Repositories;

import com.example.reactiverestservice.Models.CardModels.CardFace;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CardFaceRepository extends JpaRepository <CardFace, Long>{
    
}
