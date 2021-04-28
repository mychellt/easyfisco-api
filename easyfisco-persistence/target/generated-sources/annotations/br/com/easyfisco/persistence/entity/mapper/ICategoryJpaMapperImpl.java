package br.com.easyfisco.persistence.entity.mapper;

import br.com.easyfisco.domain.model.Category;
import br.com.easyfisco.persistence.entity.CategoryJpaEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-04-28T10:32:01-0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.7 (AdoptOpenJDK)"
)
@Component
public class ICategoryJpaMapperImpl implements ICategoryJpaMapper {

    @Override
    public CategoryJpaEntity getJpaEntity(Category source) {
        if ( source == null ) {
            return null;
        }

        CategoryJpaEntity categoryJpaEntity = new CategoryJpaEntity();

        categoryJpaEntity.setId( source.getId() );
        categoryJpaEntity.setDescription( source.getDescription() );
        categoryJpaEntity.setCode( source.getCode() );

        return categoryJpaEntity;
    }

    @Override
    public Category getDomainEntity(CategoryJpaEntity source) {
        if ( source == null ) {
            return null;
        }

        Category category = new Category();

        category.setId( source.getId() );
        category.setCode( source.getCode() );
        category.setDescription( source.getDescription() );

        return category;
    }
}
