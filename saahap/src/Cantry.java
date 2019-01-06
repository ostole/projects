
import java.util.ArrayList;
import java.util.Iterator;

public class Cantry {
    String name;
    ArrayList<City> city;

    public Cantry(String name, ArrayList<City> city) {
        this.name = name;
        this.city = city;
    }

    public int getIncomePowerCity(){
        int income = 0;
        Iterator<City> iterator = city.iterator();
        while (iterator.hasNext()){
           City city1 = iterator.next();
           income +=  city1.getIncomePower();
        }
        return income;
    }
}
