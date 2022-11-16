package araujo.financeiro.augeback.config;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
// @SecurityScheme(name = "bearerAuth", type = SecuritySchemeType.HTTP,
// bearerFormat = "JWT", scheme = "bearer")
public class SwaggerConfig {

    public SwaggerConfig() {
    }

    @Bean
    public OpenAPI starOpenAPI(ServletContext servletContext) {

        final String apiTitle = String.format("%s API", "Teste");
        final String apiVersion = "1.0.0";

        Server server = new Server().url(servletContext.getContextPath());

        return new OpenAPI()
                .info(new Info().title("Star Rest API")
                        .description("Star Rest API")
                        .version("v0.0.1")
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")))

                .info(new Info().title(apiTitle).version(apiVersion)).servers(List.of(server));

    }

}
