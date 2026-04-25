package com.example.ativpontuada.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ativpontuada.model.FuncionarioModel;


@Repository
public interface FuncionarioRepository extends JpaRepository<FuncionarioModel,Long>{
    Optional<FuncionarioModel>findByEmail(String email);
}
