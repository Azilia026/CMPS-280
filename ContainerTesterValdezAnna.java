public class ContainerTesterValdezAnna{
   public static void main(String[] args){
   ContainerValdezAnna basic = new ContainerValdezAnna();
   System.out.println("Default container: \n" + basic.toString());
   
   CookieJarValdezAnna jar = new CookieJarValdezAnna("Porcelain", "Blue and white", true, 75);
   System.out.println(jar.toString());
   
   TupperwareValdezAnna ware = new TupperwareValdezAnna(true, 99, "Honestly, just throw the whole container away");
   System.out.println(ware.toString());
   
   BoxValdezAnna box = new BoxValdezAnna(true, "Kitchen Supplies", true, 50, 5, 5, 10);
   System.out.println(box.toString());
   
   GiftBoxValdezAnna gift = new GiftBoxValdezAnna("Metal", "Silver", true, .5, .5, .5, false);
   System.out.println(gift.toString());
   }//end main
}//end clsss