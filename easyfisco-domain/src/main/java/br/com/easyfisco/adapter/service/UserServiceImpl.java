package br.com.easyfisco.adapter.service;

import br.com.easyfisco.domain.model.User;
import br.com.easyfisco.port.repository.UserRepository;
import br.com.easyfisco.port.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


/**
 * @author Mychell Teixeira (mychellt@gmail.com)
 * @since 14/04/2020.
 */
@Service
public class UserServiceImpl implements UserService {

	private final UserRepository repository;

	@Autowired
	public UserServiceImpl(UserRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<User> getAll() {
		return repository.findAll();
	}

	@Override
	public User getOne(UUID id) {
		return repository.findById(id);
	}

	@Override
	public User save(User user) {
		return repository.save(user);
	}

	@Override
	public void delete(UUID id) {
		repository.deleteById(id);
	}

}
