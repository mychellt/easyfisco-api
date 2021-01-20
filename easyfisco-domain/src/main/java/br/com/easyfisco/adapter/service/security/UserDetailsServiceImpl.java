package br.com.easyfisco.adapter.service.security;

import br.com.easyfisco.domain.model.User;
import br.com.easyfisco.port.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    private final UserRepository repository;

    @Autowired
    public UserDetailsServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = repository.findByEmail(email);
        if(Objects.isNull(user)) {
            throw new UsernameNotFoundException(email);
        }
        return UserSpringSecurity.builder()
            .email(user.getEmail())
            .password(user.getPassword())
            .id(user.getId())
            .build();
    }
}
