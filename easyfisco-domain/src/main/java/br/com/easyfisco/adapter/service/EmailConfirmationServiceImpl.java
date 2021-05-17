package br.com.easyfisco.adapter.service;

import br.com.easyfisco.adapter.service.exception.ServiceBusinessException;
import br.com.easyfisco.domain.model.AccessSolicitationToken;
import br.com.easyfisco.port.repository.IAccessSolicitationTokenRepository;
import br.com.easyfisco.port.service.IAuthorizeUserService;
import br.com.easyfisco.port.service.IEmailConfirmationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class EmailConfirmationServiceImpl implements IEmailConfirmationService {
    private final IAccessSolicitationTokenRepository rep;
    private final IAuthorizeUserService authorizer;

    @Autowired
    public EmailConfirmationServiceImpl(IAccessSolicitationTokenRepository rep,
                                        IAuthorizeUserService authorizer) {
        this.rep = rep;
        this.authorizer = authorizer;
    }

    @Override
    public AccessSolicitationToken execute(String key) throws ServiceBusinessException {
        AccessSolicitationToken token = rep.findOne(key);
        if(Objects.isNull(token)) {
            throw new ServiceBusinessException("Código de autenticação inválido");
        }

        if(token.isUsed()) {
            throw new ServiceBusinessException("O cadastro já foi confirmado anteriormente");
        }
        token.setUsed(Boolean.TRUE);
        rep.update(token);
        authorizer.execute(token);
        return token;
    }
}
