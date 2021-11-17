package com.example.springmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springmvc.model.Unit;

@Repository
public interface UnitRepository extends JpaRepository<Unit, String> {

}
