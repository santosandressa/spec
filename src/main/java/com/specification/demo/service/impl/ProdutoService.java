package com.specification.demo.service.impl;

import com.specification.demo.entity.Produto;
import com.specification.demo.filter.Filter;
import com.specification.demo.repository.ProdutoRepository;
import com.specification.demo.service.IProduto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProdutoService implements IProduto {

    private final ProdutoRepository produtoRepository;

    @Cacheable("produtos")
    @Override
    public List<Produto> findAll(Filter filter) {
        try{
            log.info("Buscando todos os produtos no banco de dados");
            return produtoRepository.findAll(filter.toSpecification());
        } catch (Exception e) {
            log.error("Erro ao buscar produtos", e);
            throw e;
        }
    }
}
