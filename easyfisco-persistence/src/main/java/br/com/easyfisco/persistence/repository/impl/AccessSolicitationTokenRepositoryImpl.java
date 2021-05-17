package br.com.easyfisco.persistence.repository.impl;

import br.com.easyfisco.domain.model.AccessSolicitationToken;
import br.com.easyfisco.persistence.entity.mapper.IAccessSolicitationTokenJpaEntityMapper;
import br.com.easyfisco.persistence.repository.IAccessSolicitationTokenJpaRepository;
import br.com.easyfisco.port.repository.IAccessSolicitationTokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AccessSolicitationTokenRepositoryImpl implements IAccessSolicitationTokenRepository {
    private final IAccessSolicitationTokenJpaRepository repJpa;
    private final IAccessSolicitationTokenJpaEntityMapper mapper;

    @Autowired
    public AccessSolicitationTokenRepositoryImpl(IAccessSolicitationTokenJpaRepository repJpa,
                                                 IAccessSolicitationTokenJpaEntityMapper mapper) {
        this.repJpa = repJpa;
        this.mapper = mapper;
    }

    @Override
    public AccessSolicitationToken findOne(String token) {
        return mapper.getDomainEntity(repJpa.findByKey(token));
    }
}
