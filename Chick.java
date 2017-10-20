class Chick implements Animal 
{  
  private String myType;
  private String mySound;
  private String myIISound;
  public Chick(String type, String sound, String otherSound){
    myType=type;
    mySound=sound;
    myIISound=otherSound;
  }
  public Chick(){
    myType="unknown";
    mySound="unknown";
    myIISound="unknown";
  }

  public String getSound(){   
   double feeling= Math.random();
   if (feeling<.5)
   return mySound;
   else 
   return myIISound;
  }
  public String getType(){return myType;}
     //your code here
}