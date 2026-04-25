package com.example.ativpontuada.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ativpontuada.model.ProdutoModel;


@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel,Long>{
    Optional<ProdutoModel>findByLote(String lote);
}
