package com.speedment.example.webinar;

import com.speedment.example.webinar.db.WebinarApplication;
import com.speedment.example.webinar.db.WebinarApplicationBuilder;
import com.speedment.example.webinar.db.sakila.sakila.film.FilmManager;
import com.speedment.runtime.core.ApplicationBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author Emil Forslund
 * @since 1.0.0
 */
@SpringBootApplication
@SpringBootConfiguration
public class Main {

    @Bean(destroyMethod = "stop")
    WebinarApplication application() {
        return new WebinarApplicationBuilder()
            .withLogging(ApplicationBuilder.LogType.STREAM)
            .withPassword("sakila")
            .build();
    }

    @Bean
    FilmManager films(WebinarApplication app) {
        return app.getOrThrow(FilmManager.class);
    }

    public static void main(String... args) {
        SpringApplication.run(Main.class, args);
    }
}
