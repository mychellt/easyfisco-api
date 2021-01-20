package br.com.easyfisco.persistence.repository;

import org.springframework.stereotype.Repository;

import br.com.easyfisco.persistence.entity.UserJpa;

/**
 * @author Mychell Teixeira (mychellt@gmail.com)
 * @since 14/02/2020.
 */
@Repository
public interface UserRepositoryJpa extends AbstractRepository<UserJpa> {

}
