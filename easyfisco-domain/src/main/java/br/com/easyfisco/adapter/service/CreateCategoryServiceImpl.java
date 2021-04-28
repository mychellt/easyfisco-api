package br.com.easyfisco.adapter.service;

import br.com.easyfisco.domain.model.Category;
import br.com.easyfisco.port.repository.ICategoryRepository;
import br.com.easyfisco.port.service.ICreateCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateCategoryServiceImpl implements ICreateCategoryService {
    private final ICategoryRepository repository;

    @Autowired
    public CreateCategoryServiceImpl(ICategoryRepository repository) {
        this.repository = repository;
    }

    @Override
    public Category execute(Category obj) {
        return repository.save(obj);
    }
}
