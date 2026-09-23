import java.util.Scanner;

public class DayOne {
    public static void main(String[] args) {
//        Add two numbers entered by the user.


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num = sc.nextInt();
        System.out.println("Enter number 2");
        int num2 = sc.nextInt();
        System.out.println("Enter number 3");
        int num3 = sc.nextInt();
        addNumber(num,num2);
        subTwoNumber(num,num2);
        multiplyTwoNumber(num,num2);
        quotientAndReminder(num,num2);
        averageOfThreeNumber(num,num2,num3);
        squareOfNumber(num);
        cubeOfNumber(num);
        areaOfRactangle(num2,num3);
        perimeterOfRactangle(num,num2);
        areaOfTriangle(num,num2);
        areaOfCircle(num);
    }
    public static void addNumber(int a,int b){
        int result = a+b;
        System.out.println("Addition of 2 number "+result);
    }

//
//                Subtract two numbers.

    public static void subTwoNumber(int a,int b){
        int result = a-b;
        System.out.println("Subtracting two numbers "+result);
    }
//
//        Multiply two numbers.
    public static void multiplyTwoNumber(int a,int b){
        int result = a*b;
        System.out.println("Multiplication of 2 numbers "+result);
    }
//
//                Divide two numbers and print quotient and remainder.

    public static void quotientAndReminder(int a, int b){
        int quotient = a/b;
        int reminder = a%b;
        System.out.println("quotient is "+quotient+" reminder is "+reminder);
    }

//
//                Find the average of three numbers.
    public static void averageOfThreeNumber(int a,int b,int c){
        int result = (a+b+c)/3;
        System.out.println("Average of 3 number is "+result);
    }
//
//                Find the square of a number.

    public static void squareOfNumber(int a){
        int result = a*a;
        System.out.println("Math square "+ Math.sqrt(a));
        System.out.println("Square Of number is "+result);
    }
//
//                Find the cube of a number.

    public static void cubeOfNumber(int a){
        int result = a*a*a;
        System.out.println("Cube of the number "+result);
    }
//
//                Find the area of a rectangle.

    public static void areaOfRactangle(int l, int b){
        double result = 0.5*l*b;
        System.out.println("Area of Triangle is "+result);
    }
//
//                Find the perimeter of a rectangle.

    public static void perimeterOfRactangle(int l , int b){
        int result = 2*(l+b);
        System.out.println("Perimeter of ractangle "+result);
    }
//
//                Find the area of a triangle.

    public static void areaOfTriangle(int l, int b){
        double result = 0.5*l*b;
        System.out.println("area of triangle "+result);
    }
//
//                Find the area of a circle.
    public static void areaOfCircle(int r){
        double result = Math.PI*r*r;
        System.out.println("Area of Circle "+result);
    }

}
