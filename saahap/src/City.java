import java.util.ArrayList;
import java.util.Iterator;

public class City {
    String name;
    ArrayList<Power> power ;

    public City(String name, ArrayList<Power> power) {
        this.name = name;
        this.power = power;
    }

    public int getIncomePower(){
        int income = 0;
        Iterator<Power> iterator = power.iterator();
        while (iterator.hasNext()){
            Power power1 = iterator.next();
            income += power1.getIncome();
        }

        return income;
    }
}
