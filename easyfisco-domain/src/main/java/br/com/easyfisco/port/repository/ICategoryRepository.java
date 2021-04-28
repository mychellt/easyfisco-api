package br.com.easyfisco.port.repository;

import br.com.easyfisco.domain.model.Category;

import java.util.List;
import java.util.UUID;

public interface ICategoryRepository {
    Category findOne(UUID id);
    Category findOne(String code);
    List<Category> getAll();
}
