package com.example.reactiverestservice.Repositories;

import com.example.reactiverestservice.Models.CardModels.Keyword;

import org.springframework.data.jpa.repository.JpaRepository;

public interface KeywordRepository extends JpaRepository<Keyword, Integer>{
    
}
