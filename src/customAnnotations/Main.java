package customAnnotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;


/**
 * @author Yeison Melo {@literal <mailto:yeison.melo@cabonline.com/>}
 * Example Java custom anontations using Java reflection
 */
public class Main {

    public static void main(String[] args) {

        Class<Dog> dogClass = Dog.class;
        boolean found=false;

        if (dogClass.isAnnotationPresent(AnimalDetails.class)) {
            Annotation annotation = dogClass.getAnnotation(AnimalDetails.class);
            AnimalDetails animal = (AnimalDetails) annotation;
            System.out.println("Dogs have " + animal.legs() + " legs");
            System.out.println("Dogs are " + animal.colour());
            System.out.println("Las modified: " + animal.lastModified());

            if (animal.haveToSpeak()) {
                for (Method method : dogClass.getDeclaredMethods()) {
                    if (method.getName().equals("speakMethod")) {
                        if (method.isAnnotationPresent(Speak.class)) {
                            Speak speak = method.getAnnotation(Speak.class);
                            if (speak.enabled()) {
                                System.out.println("This animal is allowed to speak");
                            } else {
                                System.out.println("This animal is NOT allowed to speak");
                            }
                        }
                    }
                }
            }
        }
    }
}
