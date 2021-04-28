package br.com.easyfisco.persistence.mapper;

import br.com.easyfisco.domain.model.User;
import br.com.easyfisco.persistence.entity.UserJpaEntity;
import javax.annotation.processing.Generated;

import br.com.easyfisco.persistence.entity.mapper.IUserJpaMapper;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-01-29T00:13:39-0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.7 (AdoptOpenJDK)"
)
@Component
public class UserMapperImpl implements IUserJpaMapper {

    @Override
    public UserJpaEntity getJpaEntity(User source) {
        if ( source == null ) {
            return null;
        }

        UserJpaEntity userJpa = new UserJpaEntity();

        userJpa.setId( source.getId() );
        userJpa.setEmail( source.getEmail() );
        userJpa.setPassword( source.getPassword() );

        return userJpa;
    }

    @Override
    public User getDomainEntity(UserJpaEntity source) {
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
