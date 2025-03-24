import java.util.Scanner;
public class NonLeapYear{
public static void main(String[]args){

Scanner scan = new Scanner(System.in);

System.out.println("Enter the Month to calculate the days in a Non-Leap year")
System.out.println("(Jan - Dec)");

String Month = scan.nextLine();

switch(Month){
case "Jan":
    System.out.println("This Month has 31 days");
    break;
case "Feb":
    System.out.println("This Motnh has 28 days");
    break;
case "March":
    System.out.println("This Month has 31 days");
    break;
default: 
System.out.println("Error, Spell the Month Correctly");            
}




    }
}