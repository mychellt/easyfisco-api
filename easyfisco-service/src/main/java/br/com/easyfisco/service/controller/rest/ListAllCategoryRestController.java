package br.com.easyfisco.service.controller.rest;

import br.com.easyfisco.port.service.IListAllCategoryService;
import br.com.easyfisco.service.dto.CategoryDTO;
import br.com.easyfisco.service.dto.mapper.ICategoryDTOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

import static org.apache.commons.collections4.CollectionUtils.emptyIfNull;

/**
 * @author Mychell Teixeira (mychellt@gmail.com)
 * @since 14/02/2020.
 */
@RestController
@RequestMapping("/category")
public class ListAllCategoryRestController {
    private final IListAllCategoryService service;
    private final ICategoryDTOMapper mapper;

    @Autowired
    public ListAllCategoryRestController(IListAllCategoryService service, ICategoryDTOMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    public ResponseEntity<List<CategoryDTO>> execute() {
        return ResponseEntity.ok(emptyIfNull(service.execute())
            .stream()
            .map(mapper::getDTO)
            .collect(Collectors.toList()));
    }
}
