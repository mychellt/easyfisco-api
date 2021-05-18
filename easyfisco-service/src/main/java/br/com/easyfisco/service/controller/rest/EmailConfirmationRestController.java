package br.com.easyfisco.service.controller.rest;

import br.com.easyfisco.adapter.service.exception.ServiceBusinessException;
import br.com.easyfisco.port.service.IAuthorizeUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mychell Teixeira (mychellt@gmail.com)
 */

@RestController
public class EmailConfirmationRestController {
    private final IAuthorizeUserService service;

    @Autowired
    public EmailConfirmationRestController(IAuthorizeUserService service) {
        this.service = service;
    }

    @GetMapping(value = "/user/confirmation/{token}")
    public ResponseEntity<String> execute(@PathVariable(value = "token") String token ) throws ServiceBusinessException {
        service.execute(token);
        return ResponseEntity.ok().build();
    }
}
