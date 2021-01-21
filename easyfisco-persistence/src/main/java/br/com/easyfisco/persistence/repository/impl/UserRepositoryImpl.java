package br.com.easyfisco.persistence.repository.impl;

import br.com.easyfisco.domain.model.User;
import br.com.easyfisco.persistence.mapper.UserMapper;
import br.com.easyfisco.persistence.repository.UserRepositoryJpa;
import br.com.easyfisco.port.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * @author Raphael Medeiros (raphael.medeiros@gmail.com)
 * @since 14/02/2020.
 */
@Repository
public class UserRepositoryImpl implements UserRepository {

	private final UserRepositoryJpa repositoryJpa;

	private final UserMapper mapper;

	public UserRepositoryImpl(UserRepositoryJpa repositoryJpa, UserMapper mapper) {
		this.repositoryJpa = repositoryJpa;
		this.mapper = mapper;
	}

	@Override
	public List<User> findAll() {
		return repositoryJpa.findAll().stream().map(mapper::to).collect(Collectors.toList());
	}

	@Override
	public User findById(UUID id) {
		return repositoryJpa.findById(id).stream().map(mapper::to).findFirst().orElse(null);
	}

	@Override
	public User save(User user) {
		return mapper.to(repositoryJpa.save(mapper.from(user)));
	}

	@Override
	public void deleteById(UUID id) {
		repositoryJpa.deleteById(id);
	}

	@Override
	public User findByEmail(String email) {
		return repositoryJpa.findByEmail(email);
	}

}
