class BINGOCardValdezAnna{
   
   int[][] card = new int[5][5];
   
   BINGOCardValdezAnna(){
      
      for(int row = 0; row<5; row++){//generates the first columns' numbers
         int genNumb = 1 + (int)(Math.random()*15);
         for(int j = 0; j<5; j++){
            while(card[j][0] == genNumb){
               genNumb = 1 + (int)(Math.random()*15);
               j=0;
            }
         }
         card[row][0] = genNumb;
      }
      
      for(int row = 0; row<5; row++){//second column
         int genNumb = 16 + (int)(Math.random()*15);
         for(int j = 0; j<5; j++){
            while(card[j][1] == genNumb){
               genNumb = 16 + (int)(Math.random()*15);
               j=0;
            }
         }
         card[row][1] = genNumb;
      }               

      for(int row = 0; row<5; row++){//third
         int genNumb = 31 + (int)(Math.random()*15);
         for(int j = 0; j<5; j++){
            while(card[j][2] == genNumb){
               genNumb = 31 + (int)(Math.random()*15);
               j=0;
            }
         }
         card[row][2] = genNumb;
      }   
      
      for(int row = 0; row<5; row++){//fourth
         int genNumb = 46 + (int)(Math.random()*15);
         for(int j = 0; j<5; j++){
            while(card[j][3] == genNumb){
               genNumb = 46 + (int)(Math.random()*15);
               j=0;
            }
         }
         card[row][3] = genNumb;
      }         
     
      for(int row = 0; row<5; row++){//fifth
         int genNumb = 61 + (int)(Math.random()*15);
         for(int j = 0; j<5; j++){
            while(card[j][4] == genNumb){
               genNumb = 61 + (int)(Math.random()*15);
               j=0;
            }
         }
         card[row][4] = genNumb;
      }
      
      card[2][2] = 0; //sets middle value to 0        
   }
   
   
   void calledNumb(int numb){//takes in called number then searches the array for that number and then replaces it with 0
      for(int i = 0; i<5; i++){
         for(int j = 0; j<5; j++){
            if(card[i][j] == numb){
               card[i][j] = 0;
            }
         }
      }
   }//end calledNumb
   
   
   boolean checkBingo(){//start check bingo
   
      for(int col = 0; col<5; col++){//checks the rows for bingo
         int sum = 0;
         for(int row = 0; row<5; row++){
            sum += card[row][col];
         }
         if(sum==0){
            return true;
         }
      }
      
      for(int row = 0; row<5; row++){//checks the columns for bingo
         int sum = 0;
         for(int col = 0; col<5; col++){
            sum += card[row][col];
         }
         if(sum==0){
            return true;
         }
      }
      
      int sum = 0;
      for(int row = 0; row<5; row++){//checks primary diagonal
         sum += card[row][row];
      }
      if(sum==0){
         return true;
      }

      sum = 0;
      for(int i = 0, j = 4; i<5; i++, j--){//checks second diagonal
         sum += card[i][j];
      }
      if(sum==0){
         return true;
      }
         
      return false;
   }//end check bingo
   
  
   void printCard(){//prints bingo card
      System.out.println("B\t\tI\t\tN\t\tG\t\tO");
      for(int i = 0; i<5; i++){
         for(int j = 0; j<5; j++){
            System.out.print(card[i][j] + "\t\t");
         }
         System.out.println();
      }
   }//end print card
}