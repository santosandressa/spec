package com.specification.demo.controller.dto.mapper;

import com.specification.demo.controller.dto.ProdutoDTO;
import com.specification.demo.entity.Produto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProdutoMapper {
    List<ProdutoDTO> toDto(List<Produto> produtos);
}
