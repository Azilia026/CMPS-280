class CarouselValdezAnna extends RideValdezAnna implements ChildFriendlyValdezAnna{
   
   String name;
   CarouselValdezAnna(String name){
      this.name = name;
   }
   
   public String toString(){
      return ("carousel: "+ name);
   }
}
