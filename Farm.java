class Farm  {     
   private Animal[] aBunchOfAnimals = new Animal[4];    
   public Farm()     {       
      aBunchOfAnimals[0] = new Cow("raymond","i have aids");           
      aBunchOfAnimals[1] = new Chick("chick","cluck");       
      aBunchOfAnimals[2] = new Pig("pig","oink");
      aBunchofAnimals[3] = new Giraffe("pig","oink");}         
   public void animalSounds()    {       
     for (int nI=0; nI < aBunchOfAnimals.length; nI++)       {          
       System.out.println( aBunchOfAnimals[nI].getType() + " goes " + aBunchOfAnimals[nI].getSound());       
      }    
    } 
} 