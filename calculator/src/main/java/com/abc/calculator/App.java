package com.abc.calculator;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	 Scanner scanner = new Scanner(System.in);
         Calculator calculator = new Calculator();
         boolean run = true;
         System.out.println("Enter any Mathematical Expression to evaluate (Javascript Notation)");
         while (run) {
             String exp = scanner.nextLine();
             if ("exit".equalsIgnoreCase(exp)) {
                 System.out.println("Bye Bye");
                 run = false;
                 scanner.close();
                 continue;

             }
             System.out.println("Result: " + calculator.expressionEval(exp));
             System.out.println("Try Another Expression(type exit to close): ");
         }
         int choice = 0;
         while (choice < 4) {
             System.out.println("Choose the Operation");
             System.out.println(
                     "1.Addition of Numbers 2 or More\n" +
                             "2.Subtraction of Two Numbers\n" +
                             "3.Division of Two Numbers\n" +
                             "4.Multiplication of 2 or more numbers\n" +
                             "Enter Your Choice: ");
             choice = scanner.nextInt();
             switch (choice) {
                 case 1:
                     System.out.println("Enter Space Separated Values");
                     double[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
                     System.out.println("Result: " + calculator.add(nums));
                     break;
                 case 2: System.out.println("Enter two Values");
                 System.out.println("Result: " + calculator.subtract(scanner.nextDouble(), scanner.nextDouble()));
                 break;
             case 3:
                 System.out.println("Enter two Values");
                 System.out.println("Result: " + calculator.divide(scanner.nextDouble(), scanner.nextDouble()));
                 break;
             case 4:
                 System.out.println("Enter Space Separated Values");
                 double[] muls = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
                 System.out.println("Result: " + calculator.multiply(muls));
                 break;
         }
    }
}
}
