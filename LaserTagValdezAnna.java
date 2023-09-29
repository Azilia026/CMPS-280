class LaserTagValdezAnna extends AttractionValdezAnna implements ChildFriendlyValdezAnna{

   String name;
   LaserTagValdezAnna(String name){
      this.name = name;
   }
   
   public String toString(){
      return ("laser tag: "+ name);
   }
}