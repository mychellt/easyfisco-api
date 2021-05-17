package br.com.easyfisco.persistence.repository;

import br.com.easyfisco.persistence.entity.UserJpaEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IFetchUserAccessSolicitationJpaRepository extends AbstractRepository<UserJpaEntity> {
    @Query("SELECT user FROM AccessSolicitationTokenJpaEntity token JOIN token.solicitation solicitation JOIN solicitation.user user WHERE token.id = ?1")
    UserJpaEntity execute(UUID solicitationId);
}
