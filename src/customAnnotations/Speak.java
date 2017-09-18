package customAnnotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Yeison Melo
 * Annotation class for methods
 */


@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Speak {

     boolean enabled() default false;
}
