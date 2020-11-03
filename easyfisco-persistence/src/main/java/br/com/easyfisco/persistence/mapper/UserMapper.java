package br.com.easyfisco.persistence.mapper;

import br.com.easyfisco.domain.model.User;
import br.com.easyfisco.persistence.entity.UserEntity;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;

/**
 * @author Mychell Teixeira (mychellt@gmail.com)
 * @since 14/02/2020.
 */
@Mapper(builder = @Builder(disableBuilder = true))
public interface UserMapper {
	UserEntity from(User source);
	User to(UserEntity source);
}
