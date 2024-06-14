
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printAnyString("Hi you are the best program, the program has some options such as: A,B and C");
        printAnyString("Please type any option");
        String readingString = scanner.nextLine();
        switch (readingString.toLowerCase()){
            case "a":
                printAnyString("Now you are in sum program, it is necessary to type two numbers,lest go");
                printAnyString("Typing the first number");
                int numberOne = scanner.nextInt();
                printAnyString("Typing the first number");
                int numberTwo = scanner.nextInt();
                int sumResult = sumNumbers(numberOne,numberTwo);
                printAnyString("The result of sum is "+ sumResult);
                break;

            case "b":
                System.out.println("Typing the string");
                String string = scanner.nextLine();
                System.out.println(string);
                break;

            case "c":
                System.out.println("Typing the number");
                int num = scanner.nextInt();
                double coseno = calcuCoseno(num) ;
                System.out.println("The coseno is = " +  coseno);
            default: System.out.println("Option invalidy");
            break;
        }
        scanner.close();
    }
    public static int sumNumbers(int numberOne, int numberTwo){
        int result = numberOne + numberTwo;
        return result;
    }
    public static void printAnyString(String message){
        System.out.println(message);
    }
    public static void imprintstring(String string){
        System.out.println("received string " + string);
    }
    public static double calcuCoseno(int  num){
        return Math.cos(num);
    }
}