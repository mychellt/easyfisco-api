package br.com.easyfisco.port.service;

import br.com.easyfisco.adapter.service.exception.ServiceBusinessException;
import br.com.easyfisco.domain.model.AccessSolicitationToken;
import br.com.easyfisco.domain.model.User;

public interface IAuthorizeUserService {
    User execute(AccessSolicitationToken token) throws ServiceBusinessException;
}
