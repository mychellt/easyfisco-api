package br.com.easyfisco.port.service;

import br.com.easyfisco.domain.model.Product;

public interface IRetrieveProductService {
    Product execute(String code);
}
