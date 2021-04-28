package br.com.easyfisco.service.dto.mapper;

import br.com.easyfisco.domain.model.Category;
import br.com.easyfisco.service.dto.CategoryDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-04-28T10:32:03-0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.7 (AdoptOpenJDK)"
)
@Component
public class ICategoryDTOMapperImpl implements ICategoryDTOMapper {

    @Override
    public CategoryDTO getDTO(Category source) {
        if ( source == null ) {
            return null;
        }

        CategoryDTO categoryDTO = new CategoryDTO();

        categoryDTO.setDescription( source.getDescription() );
        categoryDTO.setCode( source.getCode() );

        return categoryDTO;
    }

    @Override
    public Category getDomainEntity(CategoryDTO source) {
        if ( source == null ) {
            return null;
        }

        Category category = new Category();

        category.setCode( source.getCode() );
        category.setDescription( source.getDescription() );

        return category;
    }
}
