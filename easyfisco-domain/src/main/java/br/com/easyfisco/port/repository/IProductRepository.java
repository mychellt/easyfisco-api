package br.com.easyfisco.port.repository;

import br.com.easyfisco.domain.model.Product;

import java.util.UUID;

public interface IProductRepository {
    Product findOne(UUID id);
    Product findOne(String code);
}
