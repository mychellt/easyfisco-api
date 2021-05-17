package br.com.easyfisco.persistence.repository;

import br.com.easyfisco.persistence.entity.AccessSolicitationTokenJpaEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface IAccessSolicitationTokenJpaRepository extends AbstractRepository<AccessSolicitationTokenJpaEntity> {
    AccessSolicitationTokenJpaEntity findByKey(String token);
}
