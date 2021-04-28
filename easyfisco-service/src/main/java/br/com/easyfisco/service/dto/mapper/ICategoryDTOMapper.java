package br.com.easyfisco.service.dto.mapper;

import br.com.easyfisco.domain.model.Category;
import br.com.easyfisco.service.dto.CategoryDTO;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;

/**
 * @author Mychell Teixeira (mychellt@gmail.com)
 * @since 14/02/2020.
 */

@Mapper(builder = @Builder(disableBuilder = true))
public interface ICategoryDTOMapper {
    CategoryDTO getDTO(Category source);
    Category getDomainEntity(CategoryDTO source);
}
