import java.util.Scanner;

public class HomeWork_3 {
    public static void main(String[] args) {

     //   convert :  miles to km  ;
        Scanner input = new Scanner(System.in);

       /* System.out.print(" Enter number of miles: ");
        double mile = input.nextDouble();
        System.out.print("Your km is :  ");
        double km = mile * 1.609;

        System.out.print(km);

        */
        // Task_1:

        /*System.out.print(" Enter number of miles: ");
        float mile = input.nextFloat();
        System.out.print("Your km is :  ");
        float km = mile * 1.609f;
        System.out.println(km);


        // Task_2:
        System.out.print("Enter number of inches : ");
        double inch = input.nextDouble();
        System.out.print("Your meter is : ");
        double meter = inch / 39.97;
        System.out.print(meter);


        // Task_3

        System.out.print("Input weight in pounds: ");
        int weight = input.nextInt();
        System.out.print("Input height in inches: ");
        int height = input.nextInt();

        double result =weight * 0.45359237 / (height * 0.0254 * height * 0.0254);
        System.out.println(" Body Mass Index  is: " +result);




        //Task_4:

        System.out.print("Input distance in meters:");
        double distance = input.nextDouble();
        System.out.print("Input hour:");
        double hr = input.nextDouble();
        System.out.print("Input minutes:");
        double min = input.nextDouble();
        System.out.print("Input seconds:");
        double sec = input.nextDouble();
        double timeSec =(hr*3600)+(min*60)+sec;
        double mps = distance /timeSec;
        double kph =(distance/1000)/ (timeSec/3600);
        double mph =kph /1.609;

         System.out.println("Your speed in meters/second is:" +mps );
        System.out.println("Your speed in km/h is:" +kph );
        System.out.println("Your speed in miles /h is:" +mph);



        // Task 5 :

        System.out.print("Input 1st integer: ");
        int i1 = input.nextInt();

        System.out.print("Input 2nd integer: ");
        int i2 = input.nextInt();

        System.out.println("Sum of two integers: " + (i1+i2));

        System.out.println("Difference of two integers:"+ (i1-i2));

        System.out.println("Product of two integers:"+ (i1*i2));

        double d1=i1 +i2;
        System.out.println("Average of two integers: " + d1 / 2);
        System.out.println("Distance of two integers:"+ (i1-i2));

         */

        //Task:6
        System.out.print("Input One: ");
        int i1= input.nextInt();
        System.out.print("Input Two: ");
        int i2 =input.nextInt();

        System.out.println("Number One is: " + (i1+1));
        System.out.println("Number Two is: "+(i2-1));






    }
}
