package ex02truthreyes;

/**
 *
 * @FIONA REYES
 */
import java.util.Scanner;

public class Ex02TruthReyes {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String response;
        String repeat;
        int range = 10;
        int min = 1;
        int guesses = 3;
      
        // runs the game atleast once 
        do {
            System.out.print("\nWelcome to Higher or Lower! What will you do?\n"
                + "- Start game\n"
                + "- Change settings\n"
                + "- End application\n");
        
            response = sc.nextLine(); 
            
            switch(response){
            
                case "Start game": 
                       
                    do{ // The game itself will run atleast once until the user entered an invalid input or entered "n" which will consequently exit the game

                        int random = (int) Math.floor(Math.random()*range) + min;

                        for (int i = guesses; i > 0; i = i-1){ // for as long as the user still has guesses, the game will run, else the user loses.

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
                        System.out.println("\nDo you wanna play again? (y/n)"); // option for the user to play or again or not
                        repeat = sc.nextLine();
                    } while (repeat.equalsIgnoreCase("y"));   

                    break;

                case "Change settings": // option for the user to change the values of the limits of the random number and the number of guesses.
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
        } while (!(response.equalsIgnoreCase("End application"))); // the game will exit when the user entered "End application"
        
        System.out.println("Thank you for playing!");
    }
}
