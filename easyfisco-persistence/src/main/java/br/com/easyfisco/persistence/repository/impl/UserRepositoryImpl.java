package br.com.easyfisco.persistence.repository.impl;

import br.com.easyfisco.domain.model.User;
import br.com.easyfisco.persistence.mapper.UserMapper;
import br.com.easyfisco.persistence.repository.UserPGRepository;
import br.com.easyfisco.port.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Raphael Medeiros (raphael.medeiros@gmail.com)
 * @since 14/02/2020.
 */
@Repository
public class UserRepositoryImpl implements UserRepository {

	private final UserPGRepository pgRepository;

	private final UserMapper mapper;

	public UserRepositoryImpl(UserPGRepository pgRepository, UserMapper mapper) {
		this.pgRepository = pgRepository;
		this.mapper = mapper;
	}

	@Override
	public List<User> findAll() {
		return pgRepository.findAll().stream().map(mapper::to).collect(Collectors.toList());
	}

	@Override
	public User findById(String id) {
		return pgRepository.findById(id).stream().map(mapper::to).findFirst().orElse(null);
	}

	@Override
	public User saveOrUpdate(User user) {
		return mapper.to(pgRepository.save(mapper.from(user)));
	}

	@Override
	public void deleteById(String id) {
		pgRepository.deleteById(id);
	}

}
