package br.com.easyfisco.service.controller.rest;

import br.com.easyfisco.service.dto.UserRegistrationDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author Mychell Teixeira (mychellt@gmail.com)
 */

@RestController
public class UserRegistrationRestController {
    @PostMapping(value = "/user/registration")
    private ResponseEntity<UserRegistrationDTO> execute(@RequestBody @Valid UserRegistrationDTO user) {
        return null;
    }
}
