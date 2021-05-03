import java.util.*;

public class Calculator {

    public static void main(String args[])
    {
        runCalculator();
        MathMania.WelcomeMessage();
    }

    public static void runCalculator() {
        System.out.println("Welcome to the calculator!");
        System.out.println("This function will take two user-inputed numbers...");
        System.out.println("and allow them to add, subtract, multiply, or divide them together.");


    	double num1, num2;
        Scanner number = new Scanner(System.in);
        System.out.print("Enter first number:");

        /* We are using data type double so that user
         * can enter integer as well as floating point
         * value
         */
        num1 = number.nextDouble();
        System.out.print("Enter second number:");
        num2 = number.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = number.next().charAt(0);

        double output;

        switch(operator)
        {
            case '+':
            	output = num1 + num2;
                break;

            case '-':
            	output = num1 - num2;
                break;

            case '*':
            	output = num1 * num2;
                break;

            case '/':
            	output = num1 / num2;
                break;

            /* If user enters any other operator or char apart from
             * +, -, * and /, then display an error message to user
             * 
             */
            default:
                System.out.printf("ERROR: You have entered wrong operator. Please try again.");
                MathMania.SleepXSeconds(2);
                return;
        }

        System.out.println("MathMania is doing magic...");
        MathMania.SleepXSeconds(2);

        System.out.println(num1+" "+operator+" "+num2+": "+output);
        MathMania.SleepXSeconds(2);
        System.out.println("Returning to home screen...");
        MathMania.SleepXSeconds(2); 
        MathMania.clearScreen();
    }
}