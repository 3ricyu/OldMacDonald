class Chick implements Animal 
{     
  private String myType;
  private String mySound;
  private String my2ndSound;
  public Chick(String type, String sound1, String sound2)
  {
   myType = type;
   mySound = sound1;
   my2ndSound = sound2;
   
  }
  public Chick() 
  {
    myType = "unknown";
    mySound = "unknown";
  }
  public String getSound()
  {
    if(Math.random() > .5)
    {
    return mySound;
    }
    else
    {
    return my2ndSound;
    }
  }
  public String getType(){return myType;}
 
}
