public class Animal extends Farmer
{
  private String name;
  private String sound;
  public Animal(String name, String sound)
  {
    this.name = name;
    this.sound = sound;
  }//end Animal
  public String toString()
  {
    String output = super.toString();
    output += "\nOld MacDonald had a farm" +
    "\nE-I-E-I-O" + "\nAnd on his farm he had a " + name +
    "\nE-I-E-I-O" + "\nWith a " + sound + " " + sound + " here" + 
    "\nAnd a " + sound + " " + sound + " there" +
    "\nEverywhere a " + sound + " " + sound + 
    "\nOld MacDonald had a farm " + "\nE-I-E-I-O";
    return output;
  }//end toString
}//end class Animal