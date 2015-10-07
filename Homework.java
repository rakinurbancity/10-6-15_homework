/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;
import java.util.Scanner;
/**
 *
 * @author Gian Carlo
 */
public class Homework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        System.out.println("Welcome to the countries of the world quiz! Lets get started!");
        System.out.print("Enter the number of qouestions you would like; maximum of 5. Enter Here: ");
        int numofques = in.nextInt();
        String[] questions1 = new String[5];
        questions1[0] = "question?";
        questions1[1] = "question2";
        questions1[2] = "questions3?";
        questions1[3] = "questions4?";
        questions1[4] = "questions5";
        
        
        
        for (int k = 0;k<=numofques; numofques++){
            System.out.println(questions1[k);
            String input1 = in.nextLine();
            if (input1.contains(answers[k]){
                System.out.println("correct");
            }
            
        }

       
       
        
        
        
        
       
        
        
    }
    
}
