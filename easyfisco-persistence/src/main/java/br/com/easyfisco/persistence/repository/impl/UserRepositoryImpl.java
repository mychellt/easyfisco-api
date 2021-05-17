package br.com.easyfisco.persistence.repository.impl;

import br.com.easyfisco.domain.model.User;
import br.com.easyfisco.persistence.entity.mapper.IUserJpaMapper;
import br.com.easyfisco.persistence.repository.UserRepositoryJpa;
import br.com.easyfisco.port.repository.IUserRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * @author Mychell Teixeira (mychellt@gmail.com)
 * @since 14/02/2021.
 */
@Repository
public class UserRepositoryImpl implements IUserRepository {

	private final UserRepositoryJpa jpaRep;

	private final IUserJpaMapper mapper;

	public UserRepositoryImpl(UserRepositoryJpa jpaRep, IUserJpaMapper mapper) {
		this.jpaRep = jpaRep;
		this.mapper = mapper;
	}

	@Override
	public List<User> findAll() {
		return jpaRep.findAll().stream().map(mapper::getDomainEntity).collect(Collectors.toList());
	}

	@Override
	public User findById(UUID id) {
		return jpaRep.findById(id).stream().map(mapper::getDomainEntity).findFirst().orElse(null);
	}

	@Override
	public User save(User user) {
		return mapper.getDomainEntity(jpaRep.save(mapper.getJpaEntity(user)));
	}

	@Override
	public void deleteById(UUID id) {
		jpaRep.deleteById(id);
	}

	@Override
	public User findByEmail(String email) {
		return mapper.getDomainEntity(jpaRep.findByEmail(email));
	}

	@Override
	public boolean existsByEmail(String email) {
		return jpaRep.existsByEmail(email);
	}

}
