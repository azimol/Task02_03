import java.util.ArrayList;

/**
 * Created by Marina on 19.01.2016.
 */
public class Kit {

    public static ArrayList<Stationery> kit =
            new ArrayList<Stationery>();

    public Kit() {
        kit.add(new Notebook("first notebook"));
        kit.add(new Pen("first pen"));
        kit.add(new Pen("second pen"));
        kit.add(new Erase("first erase"));
    }
}
