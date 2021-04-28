package br.com.easyfisco.port.service;

import br.com.easyfisco.domain.model.User;

public interface ICreateUserService {
    User execute(User obj);
}
