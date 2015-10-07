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
        int randomques = 0;
        
        if(numofques>5)
        {
            System.out.println("You input: \"" +numofques +"\" thats too many! You will recieve five questions.");
            numofques = 5;
        }
        else
        {
            if(numofques == 1)
            {
                int numrandomques = randomques + 1;
                System.out.println(numrandomques);
            }
            if(numofques == 2)
            {
                int numrandomques = randomques + 2;
                System.out.println(numrandomques);
            }
            if(numofques == 3)
            {
                int numrandomques = randomques + 3;
                System.out.println(numrandomques);
            }
            if(numofques == 4)
            {
                int numrandomques = randomques + 4;
                System.out.println(numrandomques);
            }
            if(numofques >= 5)
            {
                int numrandomques = randomques + 5;
                System.out.println(numrandomques);
            }
        }
        
        
    }
    
}
