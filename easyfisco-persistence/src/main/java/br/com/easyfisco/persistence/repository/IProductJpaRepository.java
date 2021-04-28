package br.com.easyfisco.persistence.repository;

import br.com.easyfisco.persistence.entity.ProductJpaEntity;
import org.springframework.stereotype.Repository;


/**
 * @author Mychell Teixeira (mychellt@gmail.com)
 * @since 28/04/2021
 */

@Repository
public interface IProductJpaRepository extends  AbstractRepository<ProductJpaEntity> {

}
