public class Player {
    String name;
    int power;

    public Player(String name, int power) {
        this.name = name;
        this.power = power;
    }
    public int damage(Player player){
        player.power -= Math.random()*10;
        return player.power;
    }
     public String toString(){
        String str ;
        str = name +" "+ power;
        return str;
    }

}
