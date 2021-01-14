// this is a reference class
class Apple
{
  //Instance variables
private String type;
private double size; //inches diameter
private boolean isTart;
  //contructors
public Apple()
{
  type = null;
  size = 0;
  isTart = false;
}
  //toString
  public String toString()
  {
    String output = "Type " + type +
                "\nSize (inches diameter) " + size + "\nIs it Tart? " + isTart;
                return output;

  }
}