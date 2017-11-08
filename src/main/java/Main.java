import com.speedment.example.webinar.db.WebinarApplication;
import com.speedment.example.webinar.db.WebinarApplicationBuilder;
import com.speedment.example.webinar.db.sakila.sakila.film.FilmManager;

/**
 * @author Emil Forslund
 * @since 1.0.0
 */
public final class Main {
    public static void main(String... args) {
        WebinarApplication app = new WebinarApplicationBuilder()
            .withPassword("sakila")
            .build();

        FilmManager films = app.getOrThrow(FilmManager.class);
        System.out.println("Film #: " + films.stream().count());

        app.stop();
    }
}
