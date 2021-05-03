import java.util.*;

public class MathMania {
    public static void main(String[] args) {
        System.out.println("Starting MathMania...");
        WelcomeMessage();

    }

    public static void SleepXSeconds(int seconds) {
        seconds = seconds * 1000; // number of milliseconds to sleep
        long start = System.currentTimeMillis();
        while(start >= System.currentTimeMillis() - seconds);
    }

    public static void clearScreen() {   
        System.out.print("\033[H\033[2J");   
        System.out.flush();   
    } 
        
    public static void WelcomeMessage() {
        clearScreen();
        System.out.println("Welcome to MathMania: A world of mathamatical joy!");
        System.out.println("_________________________________________________________");
        System.out.println("1) Regular Calculator");
        System.out.println("2) Quadratic Equation Calculator");
        System.out.println("3) Matrix Multiplication");
        System.out.println("4) Exit");
        System.out.print("Select an option to get started: ");

        Scanner EnterChoice = new Scanner(System.in);    //System.in is a standard input stream  
        int choice = EnterChoice.nextInt();

        if (choice == 1) { clearScreen(); Calculator.main(null); EnterChoice.close();}

        else if (choice == 2) { clearScreen(); QuadraticEquation.main(null); }

        else if (choice == 3) { clearScreen(); MatrixFunctions.main(null); }

        else if (choice == 4) {
            System.out.println("Thanks for visiting MathMania!");
            SleepXSeconds(2);
            clearScreen();
        } else {
            System.out.println("Sorry. Invalid input. Please try again.");
            SleepXSeconds(2);
            WelcomeMessage();
        }
    }
}
