package com.specification.demo.filter;

import com.specification.demo.entity.Produto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.Specification;

import static com.specification.demo.specification.ProdutoSpecification.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Filter {
    private Long id;
    private String nome;
    private Double precoMin;
    private Double precoMax;

    public Specification<Produto> toSpecification() {
        return nameContains(nome).and(priceLessThan(precoMax)).and(priceGreaterThan(precoMin))
                .and(idEquals(id));
    }
}
