package br.com.easyfisco.port.service;

import br.com.easyfisco.domain.model.User;

import java.util.List;
import java.util.UUID;

/**
 * @author Mychell Teixeira (mychellt@gmail.com)
 * @since 14/02/2020.
 */
public interface UserService {
	List<User> getAll();
	User getOne(UUID id);
	User save(User user);
	void delete(UUID id);
}
