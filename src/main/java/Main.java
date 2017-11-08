import com.speedment.example.webinar.db.WebinarApplication;
import com.speedment.example.webinar.db.WebinarApplicationBuilder;
import com.speedment.example.webinar.db.sakila.sakila.film.Film;
import com.speedment.example.webinar.db.sakila.sakila.film.FilmManager;
import com.speedment.runtime.core.ApplicationBuilder;

/**
 * @author Emil Forslund
 * @since 1.0.0
 */
public final class Main {
    public static void main(String... args) {
        WebinarApplication app = new WebinarApplicationBuilder()
            .withLogging(ApplicationBuilder.LogType.STREAM)
            .withPassword("sakila")
            .build();

        FilmManager films = app.getOrThrow(FilmManager.class);
        System.out.println("Film #: " + films.stream()
            .filter(Film.LENGTH.greaterThan(40))
            .filter(Film.RATING.equal(Film.Rating.PG13))
            .count());

        app.stop();
    }
}
