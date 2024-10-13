package com.specification.demo.controller.dto;

import com.specification.demo.entity.Categoria;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

public record ProdutoDTO(
        Long id,
        @NotNull
        @Length(min = 5, max = 100, message = "The name must be between 5 and 100 characters") String nome,
        @NotNull Double preco,
        Categoria categoria
) {
}
