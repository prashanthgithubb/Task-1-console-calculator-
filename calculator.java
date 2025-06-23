package calculator;
import java.util.Scanner;
public class calculator {

    public  static double add(double a,double b){
        return a+b;
    }

    public static double sub(double a,double b){
        return a+b;
    }

    public static double multiply(double a,double b){
        return a*b;
    }

    public static double divide(double a,double b){
        if (b==0){
            System.out.println("Error divisoon by zero");
            return Double.NaN;
        }
        return a/b;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        boolean calculatestarts = true;

        System.out.println("Welcome to the simple calculator");

        while (calculatestarts){
            System.out.println("\nSelect an operation");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Divide");
            System.out.println("5.Exit");

            System.out.println("Enter the choice (1-5)");
            int choice = sc.nextInt();

            if (choice==5)
            {
                calculatestarts = false;
                System.out.println("Exiting the calculator");
                break;
            }

            System.out.println("Enter the first number");
            double num1 = sc.nextInt();

            System.out.println("Enter the Second number");
            double num2 = sc.nextInt();

            double result;

            if (choice == 1){
                result = add(num1,num2);
                System.out.println("Result: "+ result);
            } else if (choice == 2) {
                result = sub(num1,num2);
                System.out.println("Result: "+ result);
            } else if (choice==3) {
                result = multiply(num1,num2);
                System.out.println("Result: "+ result);
            } else if (choice == 4) {
                result = divide(num1,num2);
                if(!Double.isNaN(result))
                    System.out.println("Result: "+ result);
            }else {
                System.out.println("Invalid choice ! please choice valid option");
            }

        }
        sc.close();
    }

}