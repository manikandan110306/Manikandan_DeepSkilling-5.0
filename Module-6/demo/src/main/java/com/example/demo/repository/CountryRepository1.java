package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Country1;

@Repository
public interface CountryRepository1 extends JpaRepository<Country1, String> {
}
