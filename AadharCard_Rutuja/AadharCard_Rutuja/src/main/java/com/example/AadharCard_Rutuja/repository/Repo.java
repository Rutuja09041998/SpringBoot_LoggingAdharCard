package com.example.AadharCard_Rutuja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.AadharCard_Rutuja.entity.Adhar;

@Repository
public interface Repo extends JpaRepository<Adhar, Integer>{

}
