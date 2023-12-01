class ParkTycoonValdezAnna{
   public static void main(String[] args){
      RollerCoasterValdezAnna roller = new RollerCoasterValdezAnna("Cosmic Coaster");
      DropTowerValdezAnna drop = new DropTowerValdezAnna("Planetary Plunge");
      PizzaParlorValdezAnna pizza = new PizzaParlorValdezAnna("Milky Way Pizzeria");
      MirrorHouseValdezAnna mirror = new MirrorHouseValdezAnna("Mirror Mansion");
      
      
      AmusementParkValdezAnna galaxyPark = new AmusementParkValdezAnna(roller, drop, pizza, mirror); 
      
         System.out.println("Welcome to Galaxy Park! We have: ");
      
         galaxyPark.string();
      
      System.out.println("\n");
      
      
      
      BarAnnaValdez bar = new BarAnnaValdez("Sailor's Saloon");
      LaserTagValdezAnna laser = new LaserTagValdezAnna("Pirate's Den Laser Quest");
      CarouselValdezAnna caro = new CarouselValdezAnna("Treasure Trove Carouse");
      DropTowerValdezAnna drop2 = new DropTowerValdezAnna("Walk The Plank Plummet");
      
      AmusementParkValdezAnna pirateCove = new AmusementParkValdezAnna(drop2, caro, bar, laser);
      
         System.out.println("Welcome to Pirate's Cove! We have: ");
      
         pirateCove.string();
      
      System.out.println("\n");
      
      TheaterValdezAnna theater = new TheaterValdezAnna("The Enchanted Garden");
      CottonCandyStand candy = new CottonCandyStand("Enchanted Fluff");
      CarouselValdezAnna caro2 = new CarouselValdezAnna("Unicorn's Gallop");
      RollerCoasterValdezAnna roller2 = new RollerCoasterValdezAnna("Leviathan's Leap");


      AmusementParkValdezAnna fantasy = new AmusementParkValdezAnna(roller2, caro2, candy, theater);
         
         System.out.println("Welcome to Fantasy Falls! We have: ");
      
         fantasy.string();
      
   }
}
