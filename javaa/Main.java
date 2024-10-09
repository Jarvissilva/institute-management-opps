/*
 * Author: Jarvis Silva
 * Roll No: 17
 * Title: Institute Management Program
 * Description: Simple program to manage institutes
 * Start Date: 17-07-2024
 * Modified Date: 23-07-2024
 */

 package javaa;

 import java.util.Scanner;
 
 /**
  * The {@code Main} class provides a simple command-line interface for managing institutes.
  * It allows users to perform actions such as adding, viewing, and removing institutes.
  */
 public class Main {
 
     /**
      * The entry point of the Institute Management Program.
      * <p>
      * This method presents a menu to the user, allows them to choose actions
      * to manage institutes, and executes the chosen action by delegating
      * to an instance of {@link InstitueManager}.
      *
      * @param args command-line arguments (not used)
      */
     public static void main(String[] args) {
         InstitueManager institueManager = new InstitueManager();
         boolean is_exit = false;
 
         Scanner s = new Scanner(System.in);
 
         while (!is_exit) {
             System.out.println("Welcome to Institutes Management. What actions would you like to perform: ");
             System.out.println("1. Add Institutes \n2. View Institutes \n3. Remove Institute \n4. View Institute \n5. Exit");
             
             String action = s.nextLine();
 
             switch (action) {
                 case "1":
                     institueManager.add_institue();
                     break;
                 case "2":
                     institueManager.display_institues();
                     break;
                 case "3":
                     institueManager.remove_institue();
                     break;
                 case "4":
                     institueManager.display_institue();
                     break;
                 case "5":
                     System.out.println("Thank you for using our system.\n");
                     is_exit = true;
                     break;
                 default:
                     System.out.println("Please enter a valid action input.\n");
                     break;
             }
         }
 
         s.close(); // Close the scanner to prevent resource leak
     }
 }
 