package com.example.moviesuggestionbackend;

import com.example.moviesuggestionbackend.Configuration.CorsConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(CorsConfiguration.class)
public class MovieSuggestionBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieSuggestionBackendApplication.class, args);
    }

}
