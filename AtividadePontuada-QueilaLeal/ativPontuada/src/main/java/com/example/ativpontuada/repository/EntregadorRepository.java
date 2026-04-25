package com.example.ativpontuada.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ativpontuada.model.EntregadorModel;


@Repository
public interface EntregadorRepository extends JpaRepository<EntregadorModel,Long>{
    Optional<EntregadorModel>findByEmail(String email);
}
