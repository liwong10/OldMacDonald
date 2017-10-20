class NamedCow extends Cow
{
  private String myType;
  private String mySound;
  private String myName;
  public NamedCow(String type, String name, String sound){
    myName=name;
    mySound=sound;
    myType=type;
  }
  public NamedCow(){
    myName="unknown";
  }
  public String getName(){ 
  return myName;
  }
}