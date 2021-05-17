package br.com.easyfisco.port.repository;

import br.com.easyfisco.domain.model.AccessSolicitationToken;

public interface IAccessSolicitationTokenRepository {
    AccessSolicitationToken findOne(String token);
    void update(AccessSolicitationToken token);
}
