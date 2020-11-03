package br.com.easyfisco.port.service;

import br.com.easyfisco.domain.model.User;

import java.util.List;

/**
 * @author Mychell Teixeira (mychellt@gmail.com)
 * @since 14/02/2020.
 */
public interface UserService {
	List<User> getAll();
	User getOne(String id);
	User save(User user);
	void delete(String id);
}
