import java.util.Scanner;
import java.lang.Math;

import static java.lang.Math.*;

public class Calculator {
    private static double radians;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2, result;
        String operator;
        String angleUnit;

        System.out.print("Enter an operator (^, sqrt, log, ln, S, C,T): ");
        operator = scanner.next();
        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();



        num2 = 0.0;
        if (operator.equals("^")) {
            System.out.print("Enter second number: ");
            num2 = scanner.nextDouble();
            result = calculateResult(num1,num2,operator);
            System.out.print("Result: "+ result);
            return;

        }
        if (operator.equals("sqrt")) {
            result = calculateResult(num1,num2,operator);
            System.out.print("Result: "+ result);
            return;
            }
        radians = Math.toRadians((num1));
        result = calculateResult(num1,num2,operator);
        System.out.println("degrees or radians?");
        angleUnit = scanner.next();
        angleUnit = angleUnit.toLowerCase();


        if (angleUnit.equals("radians")){

            num1 = Math.toDegrees(num1);
        } result = calculateResult(num1,num2,operator);

        System.out.print("Result: "+ result);
        scanner.close();
    }

double num1, num2,result;

    public static double calculateResult(double num1, double num2, String operator) {
        if (operator.equals("^")) {
            return power(num1, num2);
        } else if (operator.equals("sqrt")) {
            return squareRoot(num1, num2);
        } else if (operator.equals("log")) {
            return logBase(num1);
        } else if (operator.equals("ln")) {
            return naturalLog(num1, num2);
        } else if (operator.equals("S")) {
            return sine(num1);
        } else if (operator.equals("C")) {
            return cosine(num1);
        } else if (operator.equals("T")) {
            return tangent(num1);

        }

        return num1;

    }



    public static double power(double num1, double num2) {
        return Math.pow(num1 , num2);
    }
    public static double squareRoot(double num1, double num2) {
        return Math.sqrt(num1);
    }
    public static double logBase(double num1) {
        return Math.log10(num1);
    }
    public static double naturalLog(double num1, double num2) {
        return Math.log(num1);
    }

    public static double sine (double num1){
       double radians = Math.toRadians(num1);
        return Math.sin(radians);

            }
    public static double cosine(double num1) {
        double radians = Math.toRadians(num1);
        return Math.cos(radians);
    }
    public static double tangent(double num1){
    double radians = Math.toRadians(num1);
    return Math.tan(radians);
    }

    }
