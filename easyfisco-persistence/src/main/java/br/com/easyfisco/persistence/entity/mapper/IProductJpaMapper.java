package br.com.easyfisco.persistence.entity.mapper;

import br.com.easyfisco.domain.model.Product;
import br.com.easyfisco.persistence.entity.ProductJpaEntity;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;

/**
 * @author Mychell Teixeira (mychellt@gmail.com)
 * @since 14/02/2020.
 */

@Mapper(builder = @Builder(disableBuilder = true))
public interface IProductJpaMapper {
    ProductJpaEntity getJpaEntity(Product source);
    Product getDomainEntity(ProductJpaEntity source);
}
