package br.com.easyfisco.adapter.service;

import br.com.easyfisco.adapter.service.exception.ServiceBusinessException;
import br.com.easyfisco.domain.model.User;
import br.com.easyfisco.port.repository.IUserRepository;
import br.com.easyfisco.port.service.IUserRegistrationService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class UserRegistrationServiceTest {
    @Mock
    private IUserRepository repository;

    private IUserRegistrationService service;

    @BeforeEach
    public void before() {
        MockitoAnnotations.initMocks(this);
        service = new UserRegistrationServiceImpl(repository);
    }

    @DisplayName("Shouldn't be able to register a new user when a given email already exists")
    @Test
    void userAlreadyExists() {
        when(repository.existsByEmail(any(String.class))).thenReturn(true);

        ServiceBusinessException ex = assertThrows(ServiceBusinessException.class, () -> service.execute(User.builder()
            .email("user@easiersystems.com.br")
            .password("password")
            .name("John Doe")
            .phoneNumber("(99) 9 9999-9999")
            .build()));

        verify(repository, times(0)).findByEmail(any(String.class));
    }
}
