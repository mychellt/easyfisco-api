package br.com.easyfisco.service.controller.rest;

import br.com.easyfisco.domain.model.Category;
import br.com.easyfisco.port.service.ICreateCategoryService;
import br.com.easyfisco.service.dto.CategoryDTO;
import br.com.easyfisco.service.dto.mapper.ICategoryDTOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mychell Teixeira (mychellt@gmail.com)
 * @since 14/02/2020.
 */
@RestController
@RequestMapping("/category")
public class CreateCategoryRestController {
    private final ICreateCategoryService service;
    private final ICategoryDTOMapper mapper;

    @Autowired
    public CreateCategoryRestController(ICreateCategoryService service, ICategoryDTOMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @PostMapping
    public ResponseEntity execute(@RequestBody CategoryDTO category) {
        service.execute(mapper.getDomainEntity(category));
        return ResponseEntity.ok().build();
    }
}
