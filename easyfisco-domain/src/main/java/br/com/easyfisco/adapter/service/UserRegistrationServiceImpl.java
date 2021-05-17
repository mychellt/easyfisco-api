package br.com.easyfisco.adapter.service;

import br.com.easyfisco.adapter.service.exception.ServiceBusinessException;
import br.com.easyfisco.adapter.service.exception.UserAlreadyExistException;
import br.com.easyfisco.domain.model.User;
import br.com.easyfisco.port.repository.IUserRepository;
import br.com.easyfisco.port.service.IUserRegistrationService;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrationServiceImpl implements IUserRegistrationService {
    private final IUserRepository repository;

    public UserRegistrationServiceImpl(IUserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User execute(User obj) throws ServiceBusinessException {

        if(exists(obj)) {
            throw new UserAlreadyExistException("Já existe um usuário com o email informado: ".concat(obj.getEmail()));
        }

        return repository.save(obj);
    }

    private boolean exists(User obj) {
        return repository.existsByEmail(obj.getEmail());
    }
}
