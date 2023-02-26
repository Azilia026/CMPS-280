/*
Anna Valdez
Feb. 23, 2023
This program will create a BINGO card, play through the game by entering called numbers, 
and determine when you have a winning card.
*/
import java.util.Scanner;
public class BINGOGameValdezAnna{//start class
   public static void main(String[] args){//start main
   
   System.out.println("Welcome to a game of BINGO!");
   System.out.println("Here is your card:");
   
   BINGOCardValdezAnna card = new BINGOCardValdezAnna();
   
   card.printCard();
    
   Scanner input = new Scanner(System.in);
   
   boolean bingo = false;
   
   while(bingo == false){
   
      System.out.println("What would you like to do? \n\t1) Enter a called number. \n\t2) See current card.");
      
      int option = input.nextInt();
       
            if(option == 1){
               System.out.print("Enter called number: ");
               card.calledNumb(input.nextInt());
            }
            
            if(option == 2){
               card.printCard();
            }
  
      bingo = card.checkBingo();
   }
   
   System.out.println("Looks like we have a winner!");
   card.printCard();
   
   }//end main
}//end class