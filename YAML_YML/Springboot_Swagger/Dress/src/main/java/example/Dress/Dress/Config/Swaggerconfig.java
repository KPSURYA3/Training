package example.Dress.Dress.Config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Swaggerconfig{

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("dress-api")
                .pathsToMatch("/dress_restapi/**")
                .build();
    }
}
