import java.util.ArrayList;


public class Employee {

    private String name;
    public static ArrayList<Stationery> onTable = new ArrayList<Stationery>();

    public Employee(String name){
        this.name = name;
    }

    public float costOfStat(){
        float summ = 0;
        for(Stationery s:onTable){
            summ += s.getPrice();
        }
        return summ;
    }

    public void displayOnTable(){
        System.out.println("On table:");
        for(Stationery st: onTable)
            System.out.println(st.name + " - " + st.getPrice());
    }

    public void addKitOfNewbie(){
        onTable.addAll(new Kit().kit);
    }
}
