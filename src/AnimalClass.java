import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Yeison Melo {@literal <mailto:yeison.melo@cabonline.com/>}
 * Exemple of a custom annotation tha defines some properties of
 * animals
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface AnimalClass {

    public enum Legs {
        ZERO, TWO, FOUR, EIGHT,
    }

    Legs legs() default Legs.ZERO;
    String colour() default "";
}
