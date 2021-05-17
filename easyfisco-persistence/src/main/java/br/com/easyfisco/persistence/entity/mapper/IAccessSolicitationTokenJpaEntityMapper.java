package br.com.easyfisco.persistence.entity.mapper;

import br.com.easyfisco.domain.model.AccessSolicitationToken;
import br.com.easyfisco.persistence.entity.AccessSolicitationTokenJpaEntity;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;

/**
 * @author Mychell Teixeira (mychellt@gmail.com)
 * @since 14/02/2020.
 */

@Mapper(builder = @Builder(disableBuilder = true))
public interface IAccessSolicitationTokenJpaEntityMapper {
    AccessSolicitationTokenJpaEntity getJpaEntity(AccessSolicitationToken source);
    AccessSolicitationToken getDomainEntity(AccessSolicitationTokenJpaEntity source);
}
