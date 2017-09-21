package reflection;

/**
 * @author Yeison Melo {@literal <mailto:yeison.melo@cabonline.com/>}
 */

public abstract class Vehicle {

    private String name;
    protected int id;
    public float witdh;

    public Vehicle(){

    }

    public Vehicle(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract String sound();

    public float getWitdh() {
        return witdh;
    }

    public void setWitdh(float witdh) {
        this.witdh = witdh;
    }
}
