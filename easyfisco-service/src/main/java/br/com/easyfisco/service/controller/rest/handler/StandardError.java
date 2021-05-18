package br.com.easyfisco.service.controller.rest.handler;


import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StandardError implements Serializable {
    private Integer status;
    private String message;
    private Long instant;
}
