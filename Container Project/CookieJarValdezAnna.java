class CookieJarValdezAnna extends ContainerValdezAnna{
   String cookieType = "Chocolate chip";
   String containerName = "Cookie jar";
   
   CookieJarValdezAnna(String material, String color, boolean filled, double percentage){
      setFilledWith("Cookies");
      setHuggable(true);
      setLidded(true);
      setMaterial(material);
      setColor(color);
      setFilled(filled);
      setFullnessPercentage(percentage);
   }
   
   void setCookieType(String cookie){
      this.cookieType = cookie;
   }
   
   public String toString(){
      String cj = containerName + ":\n" + super.toString() + "Cookie Type: " + cookieType + "\n";
      return cj;
   }
}
