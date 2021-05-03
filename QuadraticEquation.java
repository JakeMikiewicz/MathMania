import java.util.*;

public class QuadraticEquation {
    public static void main(String args[])
    {

        System.out.println("Welcome to Quadratic Equations!");
        System.out.println("This function will take a quadratic equation that is user-inputed...");
        System.out.println("and will display the function and then calculate the roots using the quadratic formula.");
        
        System.out.print("Enter a number for a: ");
        Scanner EnterChoice = new Scanner(System.in);    //System.in is a standard input stream  
        int a = EnterChoice.nextInt();

        System.out.print("Enter a number for b: ");
        int b = EnterChoice.nextInt();

        System.out.print("Enter a number for c: ");
        int c = EnterChoice.nextInt();

        printGE(a, b, c);
    }

    public static void printGE(int a, int b, int c) {        
        System.out.println("Your quadratic equation is being calculated: ");
        System.out.println("____________________________________________ ");        
        System.out.print("Your equation is: ");
        
        String QuadEquation = a +"X^2 + " + b + "X + " + c + " ";

        System.out.println(QuadEquation);
        System.out.println("Want to figure out the roots? Enter yes or no: ");

        Scanner YesOrNo = new Scanner(System.in);
        String YesNo = YesOrNo.nextLine();

        if (YesNo.equals("yes"))
        {

            MathMania.SleepXSeconds(2);
            QuadraticRoots(a, b, c);
            MathMania.SleepXSeconds(2);
            System.out.println("\n Returning to home screen...");
            MathMania.SleepXSeconds(2);
        }

        // Return to WelcomeMessage
        MathMania.WelcomeMessage();
    }

    public static void QuadraticRoots(int a, int b, int c) {
        double root1, root2;

        // calculate the determinant (b2 - 4ac)
        double determinant = b * b - 4 * a * c;

        // check if determinant is greater than 0
        if (determinant > 0) {

            // two real and distinct roots
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);

            System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
        }

        // check if determinant is equal to 0
        else if (determinant == 0) {

        // two real and equal roots
        // determinant is equal to 0
        // so -b + 0 == -b
        root1 = root2 = -b / (2 * a);
        System.out.format("root1 = root2 = %.2f;", root1);
        }

        // if determinant is less than zero
        else {

        // roots are complex number and distinct
        double real = -b / (2 * a);
        double imaginary = Math.sqrt(-determinant) / (2 * a);
        System.out.format("root1 = %.2f+%.2fi", real, imaginary);
        System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
        }
    }
}