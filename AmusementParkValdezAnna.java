import java.util.ArrayList;
class AmusementParkValdezAnna {
      ArrayList<Object> childFriendly = new ArrayList<Object>();
      ArrayList<RideValdezAnna> rides = new ArrayList<RideValdezAnna>();
      ArrayList<FoodStallValdezAnna> foodStalls = new ArrayList<FoodStallValdezAnna>();
      ArrayList<AttractionValdezAnna> attractions = new ArrayList<AttractionValdezAnna>();
      
      AmusementParkValdezAnna(RideValdezAnna raf, RideValdezAnna raf2, FoodStallValdezAnna raf3, AttractionValdezAnna raf4){//raf = ride, attraction, or foodstall
         Object[] objects = new Object[]{raf, raf2, raf3, raf4};
         
         for (int i = 0; i<objects.length; i++){
            if (objects[i] instanceof RideValdezAnna){
               rides.add((RideValdezAnna)objects[i]);
            }
         }
         
         for (int i = 0; i<objects.length; i++){
            if (objects[i] instanceof FoodStallValdezAnna){
               foodStalls.add((FoodStallValdezAnna)objects[i]);
            }
         }
         
         for (int i = 0; i<objects.length; i++){
            if (objects[i] instanceof AttractionValdezAnna){
               attractions.add((AttractionValdezAnna)objects[i]);
            }
         }
         
         for (int i = 0; i<objects.length; i++){
            if (objects[i] instanceof ChildFriendlyValdezAnna){
               childFriendly.add((ChildFriendlyValdezAnna)objects[i]);
            }
         }
      }
      
   public void string(){
      System.out.println("\t*" + rides.size() + " rides: ");
      for(int i = 0; i<rides.size(); i++){
         System.out.println("\t\t-" + (rides.get(i)).toString() + " ");
      }
      System.out.println("\t*" + foodStalls.size() + " food stall: ");
      for(int i = 0; i<foodStalls.size(); i++){
         System.out.println("\t\t-" + (foodStalls.get(i)).toString() + " ");
      }
      System.out.println("\t*" + attractions.size() + " attraction: ");
      for(int i = 0; i<attractions.size(); i++){
         System.out.println("\t\t-" +(attractions.get(i)).toString() + " ");
      }
      System.out.println("Children are welcome at our ");
      for(int i = 0; i<childFriendly.size(); i++){
         System.out.println("\t\t-" +(childFriendly.get(i)).toString() + " ");
      }
      
   }
}