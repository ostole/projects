import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Vasy",10);
        Player player1 = new Player("Pety",8);

        Scanner scanner = new Scanner(System.in);
        int number = 0;

        while (true){
            if(player.power <= 0 || player1.power <= 0){
                break;
            }
            System.out.println("Enter number : 1 or 2");
            number = scanner.nextInt();

            if(number == 1){
                player.damage(player1);
                System.out.println(player + "  "+ player1);
            } else if(number == 2){
                player1.damage(player);
                System.out.println(player1 + "  "+ player);
            }
            else {
                System.out.println("Enter invalid number");
            }
        }
        if(player.power > 0){
            System.out.println("Vasy won");
            System.out.println(player.power +"  "+ player1.power);
        }
        if(player1.power > 0){
            System.out.println("Pety won");
            System.out.println(player1.power +"  "+ player.power);
        }
        scanner.close();
    }
}
