package br.com.easyfisco.port.service;

import br.com.easyfisco.adapter.service.exception.ServiceBusinessException;
import br.com.easyfisco.domain.model.User;

public interface IUserRegistrationService {
    User execute(User obj) throws ServiceBusinessException;
}
