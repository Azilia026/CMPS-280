class EncoderValdezAnna{
   
   char[] messageArray;
   
   EncoderValdezAnna(String message){
      messageArray = message.toCharArray();//turns original string into a character array
   }
      
   String encode(int offset){
   
      if(offset>25 || offset<-25){//when offset is too big of a number, % 26 will make it smaller while retaining the correct index offset 
         offset = offset % 26;
      }
   
      while(offset<0){//when the offset is negative, += 26 will make it positive while retaining the correct indext offset
         offset += 26;
      }
   
      for(int i = 0; i<messageArray.length; i++){
         if(messageArray[i] <= 'z' && messageArray[i] >= 'a'){//for lowercase letters
            messageArray[i] = (char)('a' + (messageArray[i] - 'a' + offset) % ('z' - 'a' + 1)); 
         }
         
         if(messageArray[i] >= 'A' && messageArray[i] <= 'Z'){//for uppercase letters
            messageArray[i] = (char)('A' + (messageArray[i] - 'A' + offset) % ('Z' - 'A' + 1));
         }
      }
      
      String encoded = String.valueOf(messageArray);//turns character array back into a string
      
      return encoded;
   }
}
