package br.com.easyfisco.port.service;

import br.com.easyfisco.domain.model.Category;

public interface ICreateCategoryService {
    Category execute(Category obj);
}
