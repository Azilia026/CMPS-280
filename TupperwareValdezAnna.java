class TupperwareValdezAnna extends ContainerValdezAnna{
   String containerName = "Tupperware";
   String edibility = "edible"; //on a scale from "edible" to "honestly, just throw the whole container away" to "this is now legaly a biohazard"
   
   TupperwareValdezAnna(boolean filled, double percentage, String edibility){
      setFilledWith("Leftovers");
      setMaterial("Plastic");
      setColor("Transparent");
      setFilled(filled);
      setEdibility(edibility);
      setFullnessPercentage(percentage);
      setLidded(true);
   }
   
   void setEdibility(String edible){
      this.edibility = edible;
   }   
   
   public String toString(){
      String tw = containerName + ":\n" + super.toString() + "Edibility of food: " + edibility + "\n";
      return tw;
   }
}