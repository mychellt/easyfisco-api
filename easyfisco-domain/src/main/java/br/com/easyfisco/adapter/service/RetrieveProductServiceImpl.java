package br.com.easyfisco.adapter.service;

import br.com.easyfisco.domain.model.Product;
import br.com.easyfisco.port.repository.IProductRepository;
import br.com.easyfisco.port.service.IRetrieveProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RetrieveProductServiceImpl implements IRetrieveProductService {
    private final IProductRepository repository;

    @Autowired
    public RetrieveProductServiceImpl(IProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public Product execute(String code) {
        return repository.findOne(code);
    }
}
