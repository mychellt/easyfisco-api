package br.com.easyfisco.persistence.repository.impl;

import br.com.easyfisco.domain.model.AccessSolicitation;
import br.com.easyfisco.domain.model.User;
import br.com.easyfisco.persistence.entity.mapper.IUserJpaMapper;
import br.com.easyfisco.persistence.repository.IFetchUserAccessSolicitationJpaRepository;
import br.com.easyfisco.port.repository.IFetchUserAccessSolicitationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FetchUserAccessSolicitationRepositoryImpl implements IFetchUserAccessSolicitationRepository {
    private final IFetchUserAccessSolicitationJpaRepository repJpa;
    private final IUserJpaMapper mapper;

    @Autowired
    public FetchUserAccessSolicitationRepositoryImpl(IFetchUserAccessSolicitationJpaRepository repJpa, IUserJpaMapper mapper) {
        this.repJpa = repJpa;
        this.mapper = mapper;
    }

    @Override
    public User execute(AccessSolicitation solicitation) {
        return mapper.getDomainEntity(repJpa.execute(solicitation.getId()));
    }
}
