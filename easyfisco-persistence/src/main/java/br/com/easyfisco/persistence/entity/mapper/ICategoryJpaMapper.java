package br.com.easyfisco.persistence.entity.mapper;

import br.com.easyfisco.domain.model.Category;
import br.com.easyfisco.persistence.entity.CategoryJpaEntity;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;

/**
 * @author Mychell Teixeira (mychellt@gmail.com)
 * @since 14/02/2020.
 */

@Mapper(builder = @Builder(disableBuilder = true))
public interface ICategoryJpaMapper {
    CategoryJpaEntity getJpaEntity(Category source);
    Category getDomainEntity(CategoryJpaEntity source);
}
