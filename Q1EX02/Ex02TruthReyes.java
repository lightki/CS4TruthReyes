/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex02truthreyes;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Ex02TruthReyes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String response;
        String repeat;
        int range = 10;
        int min = 1;
        int guesses = 3;
      
        do {
            System.out.print("\nWelcome to Higher or Lower! What will you do?\n"
                + "- Start game\n"
                + "- Change settings\n"
                + "- End application\n");
        
            response = sc.nextLine();
            
            switch(response){
            
                case "Start game":

                    do{    

                        int random = (int) Math.floor(Math.random()*range) + min;

                        for (int i = guesses; i > 0; i = i-1){

                                System.out.printf("You have %d guess(es) left. What is your guess? ", i);
                                int guess = Integer.parseInt(sc.nextLine());

                                if (random == guess){
                                    System.out.println("\nCongratualations! You win!");
                                    i=0;
                                } 
                                else if (random > guess){
                                    if (i==1){
                                       System.out.println("\nYou lose!");
                                    } 
                                    else {
                                        System.out.println("\nGuess higher!");
                                    }
                                } 
                                else {
                                    if (i == 1){
                                        System.out.println("\nYou lose!");
                                    }
                                    else {
                                        System.out.println("\nGuess Higher!");
                                    }
                                }
                            }
                        System.out.println("\nDo you wanna play again? (y/n)");
                        repeat = sc.nextLine();
                    } while (repeat.equalsIgnoreCase("y"));   

                    System.out.println("Thanks for playing!");

                    break;

                case "Change settings":
                    System.out.println("What is the lower limit of the random number? " + min); 
                    System.out.println("What is the upper limit of the random number? " + range);
                    System.out.println ("How many guesses are allowed? " + guesses);
                    System.out.println ("Input new values:"
                            + "\nLower limit: ");
                    min = sc.nextInt();
                    System.out.println("Upper limit: ");
                    range = sc.nextInt();
                    System.out.println("Guesses: ");
                    guesses = sc.nextInt();

                    break;
                    
                default :
                    System.out.println ("Invalid input! Try again.");
                    break;

                }  
        } while (!(response.equalsIgnoreCase("End application")));
        
        System.out.println("Thank you for playing!");
    }
}
