package br.com.easyfisco.adapter.service;

import br.com.easyfisco.domain.model.Category;
import br.com.easyfisco.port.repository.ICategoryRepository;
import br.com.easyfisco.port.service.IRetrieveCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RetrieveCategoryServiceImpl implements IRetrieveCategoryService {
    private final ICategoryRepository repository;

    @Autowired
    public RetrieveCategoryServiceImpl(ICategoryRepository repository) {
        this.repository = repository;
    }

    @Override
    public Category execute(String code) {
        return repository.findOne(code);
    }
}
