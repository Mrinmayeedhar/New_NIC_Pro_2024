package com.project1.project.config;

<<<<<<< HEAD
=======
//package com.RupakDoc.DMF.config;



>>>>>>> f0ef1a13e33b6099d14eda616098ccedc778b692
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    String schemeName = "bearerAuth";
    String bearerFormat = "JWT";
    String scheme = "bearer";

    @Bean
    public OpenAPI caseOpenAPI(){
        return new OpenAPI().addSecurityItem(new SecurityRequirement()
                .addList(schemeName)).components(new Components()
                .addSecuritySchemes(
                        schemeName, new SecurityScheme()
                                .name(schemeName)
                                .type(SecurityScheme.Type.HTTP)
                                .bearerFormat(bearerFormat)
                                .in(SecurityScheme.In.HEADER)
                                .scheme(scheme)
                )).info(new Info()
                .title("Document Management API")
                .description("API information")
                .version("1.0")
        );
    }
}