public class Homework_5 {
    public static void main(String[] args) {
        //String Manipulations
        //Task_1
//        String text="Java Exercises!";
//        System.out.println(text.charAt(0));
//        System.out.println(text.charAt(10));
//
        //Task_2:

//        String str1="This Exercise 1";
//        String str2="This Exercise2";
//        int result= str1.compareTo(str2);
//        System.out.println(    str1+  "   is less than  "     +  str2);

        //Task_3
//        String str="\"This is exercise1\"";
//        String str2="\"This is Exercise1\"";
//
//        System.out.println("String 1:" + str);
//        System.out.println("String 2:" +str2);
//        int result=str.compareTo(str2);
//        System.out.println(str + "is equal to"  +str2);

        //Task_4:
//        String text="Java exercises and    ";
//        String text2="JavaScript Exercises";
//        System.out.println("   String 1:  "   + text);
//        System.out.println("   String 2:  "    + text2);
//        String result=text.concat(text2);
//        System.out.println("The concatinated string:   " + result);

        //Task_5:
//        String str ="PHP Exercises and Python Exercises";
//        String str1="and";
//        System.out.println("Original String:"      +str);
//        System.out.println("Specified sequence of char value:"+str1);
//        System.out.println(str.contains(str1));
//
//        String str2="PHP Exercises and Python Exercises";
//        String str3="Java";
//        System.out.println("Original String:"       + str2);
//        System.out.println("Specified sequence of char values:" +str3);
//        System.out.println(str2.equalsIgnoreCase(str3));


        //Task_6:
        String str="Stephen Edwin King";
        String str2="Walter Winchell";
        String str3="Mike Royko";

        boolean equals=str.equals(str2);
        boolean equals1=str.equals(str3);
        boolean equals2=str.equalsIgnoreCase(str);
        System.out.println(str+ "\"equals\"" +str2 +"\"?" +equals);
        System.out.println(str+ "\"equals\"" +str3 +"\"?" +equals1);
        System.out.println(str+ "\"equals\"" +str +"\"?" +equals2);
    }
}
