package br.com.easyfisco.persistence.repository.impl;

import br.com.easyfisco.domain.model.Category;
import br.com.easyfisco.persistence.entity.CategoryJpaEntity;
import br.com.easyfisco.persistence.entity.mapper.ICategoryJpaMapper;
import br.com.easyfisco.persistence.repository.ICategoryJpaRepository;
import br.com.easyfisco.port.repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import static org.apache.commons.collections4.CollectionUtils.emptyIfNull;


/**
 * @author Mychell Teixeira (mychellt@gmail.com)
 * @since 28/04/2021
 */

@Repository
public class CategoryRepositoryImpl implements ICategoryRepository {
    private final ICategoryJpaRepository jpaRepository;
    private final ICategoryJpaMapper mapper;

    @Autowired
    public CategoryRepositoryImpl(ICategoryJpaRepository jpaRepository, ICategoryJpaMapper mapper) {
        this.jpaRepository = jpaRepository;
        this.mapper = mapper;
    }

    @Override
    public Category findOne(UUID id) {
        return jpaRepository.findById(id)
            .map(mapper::getDomainEntity)
            .orElse(null);
    }

    @Override
    public Category findOne(String code) {
        return jpaRepository.findOne(Example.of(CategoryJpaEntity.builder().code(code).build()))
            .map(mapper::getDomainEntity)
            .orElse(null);
    }

    @Override
    public List<Category> getAll() {
        return emptyIfNull(jpaRepository.findAll())
                .stream()
                .map(mapper::getDomainEntity)
                .collect(Collectors.toList());
    }
}
