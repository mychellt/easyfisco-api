package br.com.easyfisco.port.service;

import br.com.easyfisco.domain.model.Person;

public interface ICreateCustomerService {
    Person execute(Person obj);
}
