package br.com.easyfisco.persistence.entity.mapper;

import br.com.easyfisco.domain.model.Category;
import br.com.easyfisco.domain.model.Product;
import br.com.easyfisco.persistence.entity.CategoryJpaEntity;
import br.com.easyfisco.persistence.entity.ProductJpaEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-04-28T10:32:01-0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.7 (AdoptOpenJDK)"
)
@Component
public class IProductJpaMapperImpl implements IProductJpaMapper {

    @Override
    public ProductJpaEntity getJpaEntity(Product source) {
        if ( source == null ) {
            return null;
        }

        ProductJpaEntity productJpaEntity = new ProductJpaEntity();

        productJpaEntity.setId( source.getId() );
        productJpaEntity.setCategory( categoryToCategoryJpaEntity( source.getCategory() ) );

        return productJpaEntity;
    }

    @Override
    public Product getDomainEntity(ProductJpaEntity source) {
        if ( source == null ) {
            return null;
        }

        Product product = new Product();

        product.setId( source.getId() );
        product.setCategory( categoryJpaEntityToCategory( source.getCategory() ) );

        return product;
    }

    protected CategoryJpaEntity categoryToCategoryJpaEntity(Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryJpaEntity categoryJpaEntity = new CategoryJpaEntity();

        categoryJpaEntity.setId( category.getId() );
        categoryJpaEntity.setDescription( category.getDescription() );
        categoryJpaEntity.setCode( category.getCode() );

        return categoryJpaEntity;
    }

    protected Category categoryJpaEntityToCategory(CategoryJpaEntity categoryJpaEntity) {
        if ( categoryJpaEntity == null ) {
            return null;
        }

        Category category = new Category();

        category.setId( categoryJpaEntity.getId() );
        category.setCode( categoryJpaEntity.getCode() );
        category.setDescription( categoryJpaEntity.getDescription() );

        return category;
    }
}
