package br.com.easyfisco.adapter.service;

import br.com.easyfisco.domain.model.Category;
import br.com.easyfisco.port.repository.ICategoryRepository;
import br.com.easyfisco.port.service.IListAllCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListAllCategoryService implements IListAllCategoryService {
    private final ICategoryRepository repository;

    @Autowired
    public ListAllCategoryService(ICategoryRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Category> execute() {
        return repository.getAll();
    }
}
