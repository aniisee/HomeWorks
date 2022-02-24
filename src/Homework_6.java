import java.util.Scanner;

public class Homework_6 {
    public static void main(String[] args) {

        // Task - 1
      /*  int num1 = 10;
        if (num1 > 0){
            System.out.println(num1 + " is Positive number");
        }else if (num1 < 0) {
            System.out.println(num1 + " is Negative number");
        }
        else {
            System.out.println(num1 + " Invalid number");
        }

       */

        // Task- 2
        //  Scanner sc = new Scanner(System.in);
      /*  System.out.print("Input first number :");
        int num1 = sc.nextInt();
        System.out.print("Input second number :");
        int num2 = sc.nextInt();
        System.out.print("Input third number :");
        int num3 = sc.nextInt();
        System.out.print("Input fourth number :");
        int num4 = sc.nextInt();

        if (num1 == num2 && num2 == num3 && num3 == num4) {
            System.out.println("Numbers are equal ");
        }
        else {
            System.out.println("Numbers are not equal !");
        }



        // Task -3
        System.out.print("Input first number :");
        int num1 = sc.nextInt();
        System.out.print("Input second number :");
        int num2 = sc.nextInt();
        System.out.print("Input third number :");
        int num3 = sc.nextInt();

        if (num1 < num2 && num2 < num3 ){
            System.out.println(" The greatest: " + num3);
        }

       */

        // Task -4
        Scanner sc = new Scanner(System.in);
        System.out.println("IN USA 65 is retirement age .");
        System.out.print("Enter your age :  ");
        int age = sc.nextInt();

        int result = 65 - age;

        if (result <= 65 && result >=0) {
            System.out.println(result + " years left till your retirement");
        } else {
            System.out.println("You're already retired");
        }

/* Task - 5
        System.out.println("Please enter a week day number between 1 to 7 :");
        int weekDays = sc.nextInt();
        if (weekDays == 1) {
            System.out.println("Monday");
        } else if (weekDays == 2) {
            System.out.println("Tuesday");
        } else if (weekDays == 3) {
            System.out.println("Wednesday");
        } else if (weekDays == 4) {
            System.out.println("Thursday");
        } else if (weekDays == 5) {
            System.out.println("Friday");
        } else if (weekDays == 6) {
            System.out.println("Saturday");
        } else if (weekDays == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid Number!!!");

 */


        }
    }

