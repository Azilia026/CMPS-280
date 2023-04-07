import java.util.Scanner;
public class EncodeDecodeValdezAnna{
   public static void main(String[] args){
   
      Scanner input = new Scanner(System.in);
   
   System.out.println("This program will read in a message and an offset to encode the message by.");
   System.out.println("It can also be used to decode a message with a given offset.");
   System.out.println("Do you want to encode or decode a message?");
   
   System.out.println("Enter 1 to encode or 2 to decode.");
   
      int option = input.nextInt();
   
   switch(option){
   
      case 1://option 1 encoder
  
         System.out.println("Enter the message that you want to encode:");
         
            input.nextLine();
            
            String messageE = input.nextLine();
            
            EncoderValdezAnna encoder = new EncoderValdezAnna(messageE);
         
         System.out.println("Enter the offset to encode with:");
         
            int offsetE = input.nextInt();
            
            messageE = encoder.encode(offsetE);
            
         System.out.println("Your encoded message is: \n\t" + messageE);
         
         System.out.println("Do you want to decode the message? (Y/N):");
         
            char choice = input.next().charAt(0);
         
         if(choice == 'Y'|| choice == 'y'){//decode the encoded message
            
            DecoderValdezAnna decoder = new DecoderValdezAnna(messageE);
            
            System.out.println("Your decoded message is: \n\t" + decoder.decode(offsetE));
           
         }
      
      break;//end encoder
      

      case 2://option 2 decoder
      
         System.out.println("Enter the message that you want to decode:");
         
            input.nextLine();
            
            String messageD = input.nextLine();
            
            DecoderValdezAnna decoder = new DecoderValdezAnna(messageD);
         
         System.out.println("Enter the offset to decode with:");
         
            int offsetD = input.nextInt();
            
            messageD = decoder.decode(offsetD);

         System.out.println("Your decoded message is: \n\t" + messageD);
         
      break;//end decoder
      
      
      default:
      
         System.out.println(option + " is not a valid input.");
   }
   
   System.out.println("\nThanks for using the program.");
   
   }//end main
}//end class