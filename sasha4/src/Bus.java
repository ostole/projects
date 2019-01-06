public class Bus extends Hodovaya {
    String name;
    String way;

    public Bus(int radius,  String name, String way) {
        super(radius, 6);
        this.name = name;
        this.way = way;
    }
}
