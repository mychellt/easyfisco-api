package br.com.easyfisco.persistence.repository.impl;

import br.com.easyfisco.domain.model.Product;
import br.com.easyfisco.persistence.entity.ProductJpaEntity;
import br.com.easyfisco.persistence.entity.mapper.IProductJpaMapper;
import br.com.easyfisco.persistence.repository.IProductJpaRepository;
import br.com.easyfisco.port.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Repository;

import java.util.UUID;


/**
 * @author Mychell Teixeira (mychellt@gmail.com)
 * @since 28/04/2021
 */

@Repository
public class ProductRepositoryImpl implements IProductRepository {
    private final IProductJpaRepository jpaRepository;
    private final IProductJpaMapper mapper;

    @Autowired
    public ProductRepositoryImpl(IProductJpaRepository jpaRepository, IProductJpaMapper mapper) {
        this.jpaRepository = jpaRepository;
        this.mapper = mapper;
    }

    @Override
    public Product findOne(UUID id) {
        return jpaRepository.findById(id)
            .map(mapper::getDomainEntity)
            .orElse(null);
    }

    @Override
    public Product findOne(String code) {
        return jpaRepository.findOne(Example.of(ProductJpaEntity.builder().code(code).build()))
            .map(mapper::getDomainEntity)
            .orElse(null);
    }
}
