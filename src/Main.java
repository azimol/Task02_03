/**
 * Created by Marina on 19.01.2016.
 */
public class Main {

    public static void main(String[] args) {

        Employee empl = new Employee("Петров Иван");
        empl.onTable.add(new Pen());
        empl.onTable.add(new Erase());
        empl.onTable.add(new Notebook());
        empl.addKitOfNewbie();

        empl.displayOnTable();
        System.out.println(empl.costOfStat());

    }
}
