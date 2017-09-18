package customAnnotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Yeison Melo}
 * Exemple of a custom annotation tha defines some properties of
 * a class
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface AnimalDetails {

    public enum Legs {
        ZERO, TWO, FOUR, EIGHT,
    }

    Legs legs() default Legs.ZERO;
    String colour() default "";
    String lastModified() default "02/12/1990";
    boolean haveToSpeak() default false;
}
