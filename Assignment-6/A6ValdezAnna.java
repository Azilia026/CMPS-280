/*
Anna Valdez
CMPS 280
May 1st 2023
*/

import java.util.Scanner;
import java.io.*;
public class A6ValdezAnna{
   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      
      System.out.println("This program will take in a file name for a file full of integers, \nand then give the number of values in the file, the largest value found, \nthe smallest value found, the sum of the values, and the average of the values");
      System.out.println("It will also write these results to another file.");
               
         boolean continueInput = true;
         do{
            try{
               System.out.print("Enter the name of the input file: ");//sampleFile.txt
   
               File iFile = new File(input.nextLine());
               
              // if(iFile.exists() == false){//looks for the file, if not there throws exception             
                //  throw new FileNotFoundException();
              // }         
               
               Scanner fInput = new Scanner(iFile);
               
               int count = 0;//counts the numbers in the file
               while (fInput.hasNext()) {
                  fInput.next();
                  count++;
               }
               
               int[] numbs = new int[count];
               
               Scanner fInput2 = new Scanner(iFile);
               
               int j = 0;
               while (fInput2.hasNext()) {
                  numbs[j] = fInput2.nextInt();
                  j++;
               }
                       
               int max = numbs[0];
               for (int i = 1; i<count; i++){
                  if(numbs[i]>max)
                  max = numbs[i];
               }
               
               int min = numbs[0];
               for (int i = 1; i<count; i++){
                  if(numbs[i]<min)
                  min = numbs[i];
               }
               
               int sum = 0;
               for (int i = 0; i<count; i++){
                  sum += numbs[i];
               }
               
               int avg = sum/count;
         
               System.out.print("Enter the name of the output file: ");//outputFile.txt
               
               File oFile = new File(input.nextLine());
               
               if(oFile.exists() == false){               
                  throw new FileNotFoundException();
               }
               
               if(oFile.compareTo(iFile)==0){//checks to see if the input file is the same as the output file, if so throw exception
                  throw new Exception();
               }

               PrintWriter output = new PrintWriter(oFile);//write all of the info into designated file
               
                  output.println("Count: " + count);
                  output.println("Largest: " + max);
                  output.println("Smallest: " + min);
                  output.println("Sum: " + sum);
                  output.println("Average: " + avg);
                  
               output.close();//closes the file
            
         System.out.println("Information from the input file that will be written to the output file: ");
         System.out.println("Count: " + count);
         System.out.println("Largest: " + max);
         System.out.println("Smallest: " + min);
         System.out.println("Sum: " + sum);
         System.out.println("Average: " + avg);
         
         continueInput = false;//ends while loop if no exceptions get thrown before this line
            }
         
      catch(FileNotFoundException ex){
         System.out.println("\nCould not find the given file name to read.");
         System.out.println("Please make sure the file name is correct.\n");
      }
      
      catch(ArrayIndexOutOfBoundsException ex){
         System.out.println("\nThe input file does not have any integers. \nPlease make sure your file is formatted properly and has only integers.\n");
      }
      
      catch(Exception ex){
         System.out.println("\nThe input file is the same as the output file. \nPlease be sure to enter two different files.\n");
      }
      
         }while(continueInput);
   }
}
