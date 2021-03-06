package br.com.easyfisco.persistence.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author Mychell Teixeira (mychellt@gmail.com)
 * @since 14/02/2020.
 */
@Configuration
@ComponentScan("br.com.easyfisco.persistence")
@EntityScan(basePackages = { "br.com.easyfisco.persistence.entity" })
@EnableJpaRepositories(basePackages = {"br.com.easyfisco.persistence.repository"})
public class PersistenceConfiguration {

}
