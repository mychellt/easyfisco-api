package br.com.easyfisco.port.repository;


import br.com.easyfisco.domain.model.User;

import java.util.List;
import java.util.UUID;

/**
 * @author Mychell Teixeira (mychellt@gmail.com)
 * @since 14/04/2020.
 */
public interface IUserRepository {
	List<User> findAll();
	User findById(UUID id);
	User save(User user);
	void deleteById(UUID id);
	User findByEmail(String email);
    boolean existsByEmail(String email);
}
