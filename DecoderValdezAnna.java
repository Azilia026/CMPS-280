class DecoderValdezAnna{

   char[] messageArray;
   
   DecoderValdezAnna(String message){
      messageArray = message.toCharArray();
   }
         
   String decode(int offset){
   
      if(offset>25 || offset<-25){
         offset = offset % 26;
      }
   
      while(offset<0){
         offset += 26;
      }
   
      for(int i = 0; i<messageArray.length; i++){
         if(messageArray[i] <= 'z' && messageArray[i] >= 'a'){//for lower case letter
            messageArray[i] = (char)('a' + (messageArray[i] - 'a' + (26 - offset)) % ('z' - 'a' + 1));
         }
         
         if(messageArray[i] >= 'A' && messageArray[i] <= 'Z'){//for uppercase letters
            messageArray[i] = (char)('A' + (messageArray[i] - 'A' + (26 - offset)) % ('Z' - 'A' + 1));
         }
      }
      
      String decoded = String.valueOf(messageArray);
      
      return decoded;
   }
}