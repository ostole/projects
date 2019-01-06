class Base{

    int id;
    static int num;


    static {


    }

    {


    }

    static void printNum(){
        System.out.println(num);

        //System.out.println(id); // ERROR
    }

    void printId(){
        System.out.println(id);
        //System.out.println(num); // OK

    }

    void printAll(){
        printId();
        printNum(); // OK
    }

    static void printAll2(){
        //printId(); // ERROR
        printNum();
    }

    Base(){
        id = num++;
    }
}


public class Main {
    public static void main(String[] args) {
        Base b1 = new Base();
        Base b2 = new Base();
        Base b3 = new Base();

        b1.printId();
        b2.printId();
        b3.printId();

        b1.printAll();

        Base.printNum();


    }

    //println
    public static void println(Object obj){
        String str;
        str = obj.toString();
        System.out.println(str);
    }
}
