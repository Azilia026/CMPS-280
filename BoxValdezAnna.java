class BoxValdezAnna extends ContainerValdezAnna{
   String containerName = "box";
   double volume;
   
   BoxValdezAnna(){
   }

   BoxValdezAnna(boolean filled, String filledWith, boolean lidded, double percentage, double length, double width, double height){
      setMaterial("Cardboard");
      setColor("Brown");
      setFilled(filled);
      setFilledWith(filledWith);
      setLidded(lidded);
      setFullnessPercentage(percentage);
      setVolume(length, width, height);
   }
   
   void setVolume(double length, double width, double height){
      this.volume = length*width*height;
   }
   
   public String toString(){
      String bx = containerName + ":\n" + super.toString() + "Volume of box: " + volume + " ft^3\n";
      return bx;
   }
}