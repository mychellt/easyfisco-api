package br.com.easyfisco.port.service;

import br.com.easyfisco.domain.model.Product;

public interface ICreateProductService {
    Product execute(Product obj);
}
