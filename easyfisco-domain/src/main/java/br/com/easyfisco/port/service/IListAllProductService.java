package br.com.easyfisco.port.service;

import br.com.easyfisco.domain.model.Product;

import java.util.List;

public interface IListAllProductService {
    List<Product> execute();
}
