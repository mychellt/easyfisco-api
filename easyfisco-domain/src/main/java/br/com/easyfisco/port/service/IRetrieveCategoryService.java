package br.com.easyfisco.port.service;

import br.com.easyfisco.domain.model.Category;

public interface IRetrieveCategoryService {
    Category execute(String code);
}
