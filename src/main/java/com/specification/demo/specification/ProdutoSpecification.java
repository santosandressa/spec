package com.specification.demo.specification;

import com.specification.demo.entity.Produto;
import lombok.experimental.UtilityClass;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.ObjectUtils;

@UtilityClass
public class ProdutoSpecification {

    public static Specification<Produto> nameContains(String name) {
        return (root, query, criteriaBuilder) -> {
            if (ObjectUtils.isEmpty(name)) {
                return null;
            }

            return criteriaBuilder.like(root.get("nome"), "%" + name.toLowerCase() + "%");
        };
    }

    public static Specification<Produto> priceLessThan(Double price) {
        return (root, query, criteriaBuilder) -> {
            if (ObjectUtils.isEmpty(price)) {
                return null;
            }

            return criteriaBuilder.lessThanOrEqualTo(root.get("preco"), price);
        };
    }

    public static Specification<Produto> priceGreaterThan(Double price) {
        return (root, query, criteriaBuilder) -> {
            if (ObjectUtils.isEmpty(price)) {
                return null;
            }

            return criteriaBuilder.greaterThanOrEqualTo(root.get("preco"), price);
        };
    }

    public static Specification<Produto> idEquals(Long id) {
        return (root, query, criteriaBuilder) -> {
            if (ObjectUtils.isEmpty(id)) {
                return null;
            }

            return criteriaBuilder.equal(root.get("id"), id);
        };
    }
}
