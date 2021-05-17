package br.com.easyfisco.adapter.service;

import br.com.easyfisco.adapter.service.exception.ServiceBusinessException;
import br.com.easyfisco.domain.model.AccessSolicitationToken;
import br.com.easyfisco.domain.model.User;
import br.com.easyfisco.port.repository.IFetchUserAccessSolicitationRepository;
import br.com.easyfisco.port.repository.IUserRepository;
import br.com.easyfisco.port.service.IAuthorizeUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static java.util.Objects.isNull;

@Service
public class AuthorizeUserServiceImpl implements IAuthorizeUserService {
    private final IFetchUserAccessSolicitationRepository fetcher;
    private final IUserRepository rep;

    @Autowired
    public AuthorizeUserServiceImpl(IFetchUserAccessSolicitationRepository fetcher, IUserRepository rep) {
        this.fetcher = fetcher;
        this.rep = rep;
    }

    @Override
    public User execute(AccessSolicitationToken token) throws ServiceBusinessException {
        User user = fetcher.execute(token.getSolicitation());
        if(isNull(user)) {
            throw new ServiceBusinessException("Não existe solicitação de acesso associada ao token informado");
        }
        user.setAuthorized(true);
        return rep.save(user);
    }
}
