package br.com.easyfisco.service.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Mychell Teixeira (mychellt@gmail.com)
 * @since 01/07/2019.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Value("${my.application.version}")
	private String applicationVersion;

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("br.com.easyfisco.controller.rest"))
                .paths(PathSelectors.regex("/.*"))
                .build().apiInfo(apiEndPointsInfo());
    }

    private ApiInfo apiEndPointsInfo() {
        return new ApiInfoBuilder().title("Easyfisco")
                .description("REST Service to Easyfisco API")
                .contact(new Contact("Mychell", "", "mychell@gmail.com"))
                .version(applicationVersion)
                .build();
    }
}
