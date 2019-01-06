public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("p1", 150);
        Player p2 = new Player("p2", 70);

        System.out.println(p1 + " " + p2);

    }

    public static void println(Object obj){
        String str;
        str = obj.toString();
        System.out.println(str);
    }
}
