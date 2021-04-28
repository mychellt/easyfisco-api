package br.com.easyfisco.persistence.entity.mapper;

import br.com.easyfisco.domain.model.NaturalPerson;
import br.com.easyfisco.domain.model.User;
import br.com.easyfisco.persistence.entity.UserJpaEntity;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.platform.commons.util.StringUtils.isNotBlank;

class UserJpaMapperTest {

    @Test
    void checkFromJpaEntityToDomainEntity() {
        UserJpaEntity user =
            UserJpaEntity.builder()
                .email("email")
                .password("password")
                .build();

        IUserJpaMapper mapper = Mappers.getMapper(IUserJpaMapper.class);
        User obj = mapper.getDomainEntity(user);
        assertNotNull(obj);
        assertTrue(isNotBlank(obj.getEmail()));
        assertTrue(isNotBlank(obj.getPassword()));
    }

    @Test
    void checkFromDomainEntityToJpaEntity() {
        User user =
            User.builder()
                .email("email")
                .password("password")
                .build();

        IUserJpaMapper mapper = Mappers.getMapper(IUserJpaMapper.class);
        UserJpaEntity obj = mapper.getJpaEntity(user);
        assertNotNull(obj);
        assertTrue(isNotBlank(obj.getEmail()));
        assertTrue(isNotBlank(obj.getPassword()));
    }
}
