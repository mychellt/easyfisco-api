package br.com.easyfisco.persistence.repository;

import org.springframework.stereotype.Repository;

import br.com.easyfisco.persistence.entity.UserEntity;

/**
 * @author Mychell Teixeira (mychellt@gmail.com)
 * @since 14/02/2020.
 */
@Repository
public interface UserPGRepository extends AbstractPGRepository<UserEntity> {

}
