package com.specification.demo.controller;

import com.specification.demo.controller.dto.ProdutoDTO;
import com.specification.demo.controller.dto.mapper.ProdutoMapper;
import com.specification.demo.entity.Produto;
import com.specification.demo.filter.Filter;
import com.specification.demo.service.impl.ProdutoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/produtos")
@RequiredArgsConstructor
@Slf4j
public class ProdutoController {

    private final ProdutoService produtoService;
    private final ProdutoMapper mapper;

    @GetMapping
    public ResponseEntity<List<ProdutoDTO>> getProdutos(Filter filter) {
        List<Produto> produtos = produtoService.findAll(filter);
        log.info("Chamada do endpoint de produtos");
        return ResponseEntity.ok(mapper.toDto(produtos));
    }

}