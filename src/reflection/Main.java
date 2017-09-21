package reflection;


import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Yeison Melo
 *         Experimenting with java reflection to inspect a class and its members
 */
public class Main {

    public static void main(String[] args) {


        try {
            Class<Car> car = Car.class;
            Class<?> carTwo = Class.forName("reflection.Car");

            Car b = car.newInstance(); b.setFuelSource("gasoline"); b.setNumWheels(4); b.setId(1); b.setName("car"); b.setWitdh(4L);
            for (Method method : car.getMethods()) {
                if (method.getName().equals("sound")) {
                    Method methodFound = car.getDeclaredMethod("sound");
                    System.out.println("\n" + methodFound.invoke(b));
                }
            }

            System.out.println("\nFields: ");
            for (Field field: car.getFields()){
                System.out.println(field.getName()+": "+field.get(b)+" ");
            }

            for (Field field: car.getSuperclass().getFields()){
                System.out.println(field.getName()+": "+field.get(b)+" ");
            }


        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
