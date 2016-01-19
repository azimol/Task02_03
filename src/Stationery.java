import java.util.ArrayList;

public class Stationery{

    protected String name;
    protected float price = 0.0f;
    public static int totalCount = 0;

    public Stationery(){
        this.name = "no name";
        totalCount++;
    }

    public Stationery(String name) {
        this();
        this.name = name;
    }

    public void display(){
        System.out.println(this.getClass());
    }

    public float getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
