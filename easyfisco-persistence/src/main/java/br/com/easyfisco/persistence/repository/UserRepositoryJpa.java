package br.com.easyfisco.persistence.repository;

import br.com.easyfisco.domain.model.User;
import br.com.easyfisco.persistence.entity.UserJpaEntity;
import org.springframework.stereotype.Repository;

/**
 * @author Mychell Teixeira (mychellt@gmail.com)
 * @since 14/02/2020.
 */
@Repository
public interface UserRepositoryJpa extends AbstractRepository<UserJpaEntity> {

    User findByEmail(String email);
}
