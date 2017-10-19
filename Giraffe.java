class Giraffe implements Animal 
{    
  private String myType;
  private String mySound;
  public Giraffe(String type, String sound)
  {
    myType=type;
    mySound=sound;
  }
  public Giraffe()
  {
    myType="unknown";
    mySound="unknown";
  }
  public String getSound(){return mySound;}
  public String getType(){return myType;}
     //your code here
}