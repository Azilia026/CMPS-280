class RollerCoasterValdezAnna extends RideValdezAnna implements ChildFriendlyValdezAnna{

   String name;
   RollerCoasterValdezAnna(String name){
      this.name = name;
   }
   
   public String toString(){
      return ("roller coaster: " + name);
   }
}