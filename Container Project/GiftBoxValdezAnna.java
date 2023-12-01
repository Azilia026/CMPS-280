class GiftBoxValdezAnna extends BoxValdezAnna{;
   String specialOccasion = "Birthday"; //ex. birthday, christmas etc.
   boolean bow;
   
   GiftBoxValdezAnna(String Material, String color, boolean filled, double length, double width, double height, boolean bow){
      setColor(color);
      setFilledWith("A surprise!");
      setLidded(true);
      setFilled(filled);
      setMaterial(Material);
      setHuggable(true);
      setVolume(length, width, height);
      if(filled = true){
         setFullnessPercentage(100);
      }
      this.bow = bow;
   }
   
   void setSoecialOccasion(String occasion){
      this.specialOccasion = occasion;
   }
   public String toString(){
      String bx =  "Gift" + super.toString() + "Occasion:" + specialOccasion + "\nBow?:" + bow;
      return bx;
   }
   
}
