
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

enum Names {мячик, кукла, солдатик, машинка, робот}
    

public class GetRandomToy{

   public static void main(String[] args) {
      Random rnd = new Random();
   //  int chance = rnd.nextInt(10)*10;
   ArrayList myToys = new ArrayList<Toy>();
   generateToys(myToys, rnd);
   changeChances(myToys, rnd);
  
}
public static void changeChances(ArrayList<Toy> toys, Random rnd) {
   for(Toy t : toys){
      int r = rnd.nextInt(10)*10;
      t.setChance(r);
  }
}
public static void generateToys(List<Toy> array, Random rnd) {
   int counter = Names.values().length;
   for (int i = 0; i < counter; i++){
      Toy t = new Toy(Names.values()[i], rnd.nextInt(10)*10);
  }
}


}
class Toy{
   public static int counter = 1;
   int id;
   Names name;
   protected int chance;
   Toy(Names name, int chance){
      this.id = counter++;
      this.name = name;
      this.chance = chance;
   }
   public void setChance(int chance){
      this.chance = chance;
   }
}