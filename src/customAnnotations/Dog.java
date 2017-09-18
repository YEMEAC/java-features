package customAnnotations;

/**
 * @author Yeison Melo
 */

@AnimalDetails( legs = AnimalDetails.Legs.FOUR, haveToSpeak = true)
public class Dog {

    public String speakMethod(){
        return "GUAU GUAU";
    }
}
