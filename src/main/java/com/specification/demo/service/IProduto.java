package com.specification.demo.service;

import com.specification.demo.entity.Produto;
import com.specification.demo.filter.Filter;

import java.util.List;

public interface IProduto {

    List<Produto> findAll(Filter filter);
}
