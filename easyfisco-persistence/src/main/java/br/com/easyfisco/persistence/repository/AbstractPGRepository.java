package br.com.easyfisco.persistence.repository;

import br.com.easyfisco.persistence.entity.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * @author Mychell Teixeira (mychellt@gmail.com)
 * @since 14/02/2020.
 */
@NoRepositoryBean
public interface AbstractPGRepository<T extends Entity> extends JpaRepository<T, String> {

}
