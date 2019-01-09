public class Main {

    public static String print(CoffeEspresso obj){
        String str = null;

        if(obj instanceof  TurnicMachine){
            str = ((TurnicMachine) obj).dablEspressoCoffe();

        }
        else if(obj instanceof ShcafMachine){
            str = ((ShcafMachine) obj).dablEspressoCoffe();
        }
        else{
            str = obj.espressoCoffe();
        }

        return str;
    }

    public static void main(String[] args) {
        CoffeEspresso coffeEspresso = new TurnicMachine();
        CoffeEspresso coffeEspresso1 = new TableMachine();
        CoffeEspresso coffeEspresso2 = new ShcafMachine();

        System.out.println(print(coffeEspresso));
        System.out.println(print(coffeEspresso2));
        System.out.println(print(coffeEspresso1));
    }
}
