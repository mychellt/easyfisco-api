package br.com.easyfisco.persistence.mapper;

import br.com.easyfisco.domain.model.User;
import br.com.easyfisco.persistence.entity.UserJpa;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-01-21T01:00:28-0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.7 (AdoptOpenJDK)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserJpa from(User source) {
        if ( source == null ) {
            return null;
        }

        UserJpa userJpa = new UserJpa();

        userJpa.setId( source.getId() );
        userJpa.setEmail( source.getEmail() );
        userJpa.setPassword( source.getPassword() );

        return userJpa;
    }

    @Override
    public User to(UserJpa source) {
        if ( source == null ) {
            return null;
        }

        User user = new User();

        user.setId( source.getId() );
        user.setEmail( source.getEmail() );
        user.setPassword( source.getPassword() );

        return user;
    }
}
