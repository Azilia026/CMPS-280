/*
Anna Valdez
27 January 2023
This program will roughly calculate your grade in the course. 
It will read in a number of different values to fill in the
different parts needed to find your exam average, assignment average, 
and overall grade for the class. 
*/

import java.util.Scanner;

public class GradeValdezAnna { //Start class

   public static void main (String[] args) { //Start main
   
      System.out.println("This program can be used to find your current exam average, assignment average, and overall score in the course.");
      
         Scanner input = new Scanner(System.in);
      
            double exAverage;
            
            double assignAverage;
      
      
      System.out.print("Let's start with Exams. Enter how many exams have been taken so far: ");
      
         double exam = input.nextInt();
         
            if (exam == 0)
               exAverage = 100;
            else {
               exAverage = exAvg(exam);
               }
      
      System.out.print("Now enter how many assignments have been done: ");
      
         double assignment = input.nextInt();
        
            if (assignment == 0)
               assignAverage = 100;
            else {
               assignAverage = avg(assignment);
               }
               
      System.out.println("Your current averages and grades are: ");
      
         System.out.println("Exam Average: " + exAverage + "%");
         
         System.out.println("Assignment Average: " + assignAverage + "%");
         
         System.out.println("Overall Grade: " + Math.ceil((exAverage*0.4) + (assignAverage*0.5)+10) + "%");
   
   } //End main

     public static double exAvg(double amount){//start exAvg
     
       Scanner input = new Scanner(System.in);
         
       double[] grades = new double[(int)(amount)];
      
      System.out.print("Go ahead and enter " + (int)(amount) + " exam grades:");
      
         
         for(int i = 0; i < amount; i++){//inputs values into array
            
            grades[i] = input.nextDouble();
   
         }
         
         
         if(amount == 4){//start if, finds sum and the lowest value of the array, subtracts the lowest value of the array then finds the average
         
         double sum = 0;
         
            for(int i = 0; i < amount; i++){
                   sum += grades[i];
               }
            
         double lowest = grades[0];
         
            for(int i = 0; i < amount; i++){
               
               if(grades[i] < lowest){
                  lowest = grades[i];
               }
         
            }   
         
         double average = (sum - lowest)/3; //subtracts the lowest grade from the sum
      
         return Math.ceil(average);
         }//end if
         
         
         else{
         
            double sum = 0;
            
               for(int i = 0; i < amount; i++){
                   sum += grades[i];
               }    
            
            double average = sum/amount;
               
         return Math.ceil(average);
         }
     }//End exAvg
     
     
     public static double avg(double amount){ //takes in the amount of asignemnst done, returns average grade
      
         Scanner input = new Scanner(System.in);
         
         double[] grades = new double[(int)(amount)];
      
      System.out.print("Go ahead and enter " + (int)(amount) + " assignment grades: ");
      
         
         for(int i = 0; i < amount; i++){ //inputs the grade values into the array
         
            grades[i] = input.nextDouble();
         
         }
         
         
         double sum = 0;
         
         for(int i = 0; i < amount; i++){ //finds the sum of the array
             sum += grades[i];
         }    
         
         
         double average = sum/amount; //finds the average
      
      return Math.ceil(average);
      
      }//End avg

   
} //End class
   