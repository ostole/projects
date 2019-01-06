import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Power> power = new ArrayList<>();

        power.add(0,new Airport("hitrow",100));
        power.add(1,new Factory("bmw",200));
        power.add(2,new Railway("uzg",300));

        ArrayList<Power> powerOne = new ArrayList<>();

        powerOne.add(0,new Airport("gulyni",120));
        powerOne.add(1,new Factory("audy",140));
        powerOne.add(2,new Factory("lada",90));
        powerOne.add(3,new Railway("swr",80));

        City kiev = new City("Kiev", power);
        City odessa = new City("Odessa",powerOne);

        ArrayList<City> cities = new ArrayList<>();

        cities.add(0,kiev);
        cities.add(1,odessa);

        Cantry ukr = new Cantry("Ukraina",cities);

        System.out.println(kiev.getIncomePower());
        System.out.println(ukr.getIncomePowerCity());

    }
}
