package com.example.reactiverestservice.Repositories;

import com.example.reactiverestservice.Models.CardModels.ColorIdentity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ColorIdentityRepository extends JpaRepository<ColorIdentity, Integer>{
    
}
