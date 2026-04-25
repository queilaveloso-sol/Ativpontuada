package com.example.ativpontuada.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ativpontuada.model.ProdutoModel;
import com.example.ativpontuada.repository.ProdutoRepository;

@Service
public class ProdutoService { 
    @Autowired
    private ProdutoRepository produtoRepository;

    public List<ProdutoModel>listarProdutos(){
        return produtoRepository.findAll();
    }

    public ProdutoModel salvarProdutos(ProdutoModel produto){
        if (produtoRepository.findByLote(produto.getLote()).isPresent()) {
            throw new RuntimeException("Lote já cadastrado");
        }
        return produtoRepository.save(produto);
    }

    public ProdutoModel atualizarProdutos(Long id, ProdutoModel produto){
        if (!produtoRepository.existsById(id)) {
            throw new IllegalArgumentException("Produto não encontrado,tente novamente!!");
        }
        produto.setId(id);
        return produtoRepository.save(produto);
    }

    public void deletarProdutos(Long id){
        if (!produtoRepository.existsById(id)) {
            throw new IllegalArgumentException("Produto não encontrado,tente novamente!!");
        }
        produtoRepository.deleteById(id);
    }
}
