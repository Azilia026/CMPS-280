class CottonCandyStand extends FoodStallValdezAnna implements ChildFriendlyValdezAnna{

   String name;
   CottonCandyStand(String name){
      this.name = name;
   }
   
   public String toString(){
      return ("cotton candy stand: "+ name);
   }
}
