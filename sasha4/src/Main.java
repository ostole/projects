import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(15,"ZAZ","RED");
        Car car1 = new Car(17,"MAZDA","BLACK");
        Car car2 = new Car(15,"NISSAN","GREEN");
        Bus bus = new Bus(21,"DAF","DOMOY");
        Bus bus1 = new Bus(22,"NEOPLAN","JOB");
        Bus bus2 = new Bus(21,"ICARUS","CLUB");

        Collection<Hodovaya> hodovayas = new ArrayList<>();
         hodovayas.add(car);
         hodovayas.add(car1);
         hodovayas.add(car2);
         hodovayas.add(bus);
         hodovayas.add(bus1);
         hodovayas.add(bus2);

        for(Hodovaya hodovaya:hodovayas){
            System.out.println(hodovaya);
        }

    }
}
