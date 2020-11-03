package br.com.easyfisco.port.repository;


import br.com.easyfisco.domain.model.User;

import java.util.List;

/**
 * @author Mychell Teixeira (mychellt@gmail.com)
 * @since 14/04/2020.
 */
public interface UserRepository {
	List<User> findAll();
	User findById(String id);
	User saveOrUpdate(User user);
	void deleteById(String id);
}
