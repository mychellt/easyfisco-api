package br.com.easyfisco.persistence.repository;

import br.com.easyfisco.domain.model.User;
import org.springframework.stereotype.Repository;

import br.com.easyfisco.persistence.entity.UserJpa;

/**
 * @author Mychell Teixeira (mychellt@gmail.com)
 * @since 14/02/2020.
 */
@Repository
public interface UserRepositoryJpa extends AbstractRepository<UserJpa> {

    User findByEmail(String email);
}
