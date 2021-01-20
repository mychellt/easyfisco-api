package br.com.easyfisco.persistence.repository;

import br.com.easyfisco.persistence.entity.EntityPersistent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.UUID;

/**
 * @author Mychell Teixeira (mychellt@gmail.com)
 * @since 14/02/2020.
 */
@NoRepositoryBean
public interface AbstractRepository<T extends EntityPersistent> extends JpaRepository<T, UUID> {

}
