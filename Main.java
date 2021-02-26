//Marc Encarnacion
//2/25/21
//7.5 PP Old Macdonald
class Main 
{
  public static void main(String[] args) 
  {
    System.out.println();
    System.out.println("Marc Encarnacion, 7.5 PP Old Macdonald");
    System.out.println();
    Animal chick = new Animal("chick", "peep");
    Animal cow = new Animal("cow", "moo");
    Animal pig = new Animal("pig", "oink");
    Animal[] farm = {cow, pig, chick, chick};
    for (Animal animals : farm)
    {
      System.out.println(animals.toString());
    }//end for loop
  }//end main method
}//end main class