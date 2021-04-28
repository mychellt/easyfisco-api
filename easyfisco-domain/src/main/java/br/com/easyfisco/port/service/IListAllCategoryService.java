package br.com.easyfisco.port.service;

import br.com.easyfisco.domain.model.Category;

import java.util.List;

public interface IListAllCategoryService {
    List<Category> execute();
}
