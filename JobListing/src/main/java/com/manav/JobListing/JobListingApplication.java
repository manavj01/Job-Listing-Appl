package com.manav.JobListing;

import io.swagger.v3.oas.annotations.Hidden;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JobListingApplication {

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("springshop-public")
                .pathsToMatch("/**")
                .build();
    }

    public static void main(String[] args) {
        SpringApplication.run(JobListingApplication.class, args);
    }

}
