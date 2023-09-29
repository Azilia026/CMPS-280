class TheaterValdezAnna extends AttractionValdezAnna implements ChildFriendlyValdezAnna{

   String nameOfPlay;
   TheaterValdezAnna(String name){
      this.nameOfPlay = name;
   }
   
   public String toString(){
      return ("theater, where we are playing: "+ nameOfPlay);
   }
}