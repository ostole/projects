import java.util.ArrayList;
import java.util.Collection;

public class Building {
    private static int counter = 0;
    private int number = 0;

    public Building() {
        counter++;
        number = counter;
    }

    @Override
    public String toString() {

        return "Building{}"+ number;
    }

    public static void main(String[] args) {
        Collection <Building> buildings = new ArrayList<>();

        for (int i= 0;i<10;i++){
            Building building = new Building();
            buildings.add(building);
            System.out.println(building);
        }
        for (Building building:buildings){
            System.out.println(building);
        }
    }

}
