package br.com.easyfisco.persistence.entity.mapper;

import br.com.easyfisco.domain.model.User;
import br.com.easyfisco.persistence.entity.UserJpaEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-04-28T10:32:01-0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.7 (AdoptOpenJDK)"
)
@Component
public class IUserJpaMapperImpl implements IUserJpaMapper {

    @Override
    public UserJpaEntity getJpaEntity(User source) {
        if ( source == null ) {
            return null;
        }

        UserJpaEntity userJpaEntity = new UserJpaEntity();

        userJpaEntity.setId( source.getId() );
        userJpaEntity.setEmail( source.getEmail() );
        userJpaEntity.setPassword( source.getPassword() );

        return userJpaEntity;
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
