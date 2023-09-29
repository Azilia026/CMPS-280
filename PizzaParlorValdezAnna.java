class PizzaParlorValdezAnna extends FoodStallValdezAnna implements ChildFriendlyValdezAnna{

   String name;
   PizzaParlorValdezAnna(String name){
      this.name = name;
   }


   public String toString(){
      return ("pizza parlor: "+ name);
   }
}