package br.com.easyfisco.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class PersonEntity extends Entity {
    private TypeOfPersonEntity type;
}
