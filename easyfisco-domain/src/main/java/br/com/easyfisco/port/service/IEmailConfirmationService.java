package br.com.easyfisco.port.service;

import br.com.easyfisco.adapter.service.exception.ServiceBusinessException;
import br.com.easyfisco.domain.model.AccessSolicitation;
import br.com.easyfisco.domain.model.AccessSolicitationToken;

public interface IEmailConfirmationService {
    AccessSolicitationToken execute(String token) throws ServiceBusinessException;
}
