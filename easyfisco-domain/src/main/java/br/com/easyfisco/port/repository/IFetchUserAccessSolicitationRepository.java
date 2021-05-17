package br.com.easyfisco.port.repository;

import br.com.easyfisco.domain.model.AccessSolicitation;
import br.com.easyfisco.domain.model.User;

public interface IFetchUserAccessSolicitationRepository {
    User execute(AccessSolicitation solicitation);
}
