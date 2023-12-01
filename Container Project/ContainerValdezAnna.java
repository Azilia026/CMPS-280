//and a toString method to create a String version of your object, and its attributes, for printing.
class ContainerValdezAnna{

   String material = "Unkown";
   String color = "None";
   boolean filled;
   String filledWith = "Nothing";
   double fullnessPercentage;
   boolean huggable;
   boolean lidded;
   
   void setFilledWith(String newFilling){
      this.filledWith = newFilling;
   }
   
   void setHuggable(boolean hugs){
      this.huggable = hugs;
   }
   
   void setMaterial(String newMaterial){
      this.material = newMaterial;
   }
   
   void setFilled(boolean Filled){
      this.filled = Filled;
   }
   
   void setColor(String newColor){
      this.color = newColor;
   }
   
   void setFullnessPercentage(double percentage){
      this.fullnessPercentage = percentage;
   }
   
   void setLidded(boolean lidded){
      this.lidded = lidded;
   }
   
   public String toString(){
   String lol = "Material: " + material + "\nColor: " + color + "\nFilled: " + filled + "\nFilled With: " + filledWith + "\nLidded: " + lidded + "\nHuggable container?: " + huggable + "\nThe container is " + fullnessPercentage + "% full\n";
   return lol;
   }
}
