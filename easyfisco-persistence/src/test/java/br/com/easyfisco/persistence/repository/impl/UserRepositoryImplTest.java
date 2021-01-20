package br.com.easyfisco.persistence.repository.impl;

import br.com.easyfisco.domain.model.User;
import br.com.easyfisco.persistence.entity.UserJpa;
import br.com.easyfisco.persistence.mapper.UserMapper;
import br.com.easyfisco.persistence.repository.UserRepositoryJpa;
import br.com.easyfisco.port.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * @author Mychell Teixeira (mychellt@gmail.com)
 * @since 14/02/2020.
 */
class UserRepositoryImplTest {

	private UserRepository repository;

	@Mock
	private UserRepositoryJpa pgRepository;

	@Mock
	private UserMapper mapper;

	private UserJpa entity;

	@BeforeEach
	void setUp() {
		MockitoAnnotations.initMocks(this);

		repository = new UserRepositoryImpl(pgRepository, mapper);

		entity = new UserJpa();
		entity.setId("1L");
		entity.setCreatedDate(new Date());
		entity.setLastModifiedDate(new Date());
		entity.setLogin("Entity A");
	}

	@Test
	void findAll() {
		BDDMockito.given(pgRepository.findAll()).willReturn(Collections.singletonList(entity));

		List<User> all = repository.findAll();

		Assertions.assertNotNull(all);
		Assertions.assertTrue(all.size() > 0);
	}

	@Test
	void findById() {
	}

	@Test
	void saveOrUpdate() {
	}

	@Test
	void deleteById() {
	}

}