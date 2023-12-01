class MirrorHouseValdezAnna extends AttractionValdezAnna implements ChildFriendlyValdezAnna{

   String name;
   MirrorHouseValdezAnna(String name){
      this.name = name;
   }
   
   public String toString(){
      return ("mirror house: "+ name);
   }
}
