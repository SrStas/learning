import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        // TODO: Write a line of code here that prints the contents of inputString to stdout.
        //PrintHelloWorld();
        //CalculateTheMealCost();
        //EvenOddDetector();
        //Person pers = new Person()
        //CallPerson();
        StringOp1();

    }
    public static void StringOp1(){
        Scanner scann = new Scanner(System.in);
        int T = scann.nextInt();
        scann.nextLine();
        for (int i = 1; i < T; i++) {
            String myString = scann.nextLine();
            char[] ch=myString.toCharArray();
            for (int j =0; j< ch.length;j=j+2){
                System.out.print(ch[j]);
            }
            System.out.print(" ");
            for (int j =1; j< ch.length;j=j+2){
                System.out.print(ch[j]);
            }
            System.out.println();
        }
    }

    public static void CallPerson()  {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();


        }
        sc.close();


    }
    public  static  void EvenOddDetector(){
        Scanner scan = new Scanner(System.in);
        int inNumber;
        inNumber = scan.nextInt();
        if ((inNumber <= 100)&&(inNumber>=1)){
            if (inNumber % 2 !=0) System.out.println("Weird");
            else {
                if ((inNumber<=5)&&(inNumber>=2)){
                    System.out.println("Not Weird");

                }else if ((inNumber<=20)&&(inNumber>=6)){
                    System.out.println("Weird");
                }else if (inNumber>=20){
                    System.out.println("Not Weird");
                }else throw new EmptyStackException();


            }
        } else throw new EmptyStackException();
    }
    public static void CalculateTheMealCost(){
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt();
        int taxPercent = scan.nextInt();
        scan.close();
        // TODO: Do Calculations here
        int totalCost = (int)Math.round(mealCost+ mealCost*tipPercent/100+mealCost*taxPercent/100);
        System.out.println("The total meal cost is " +  totalCost+ " dollars.");
    }

    public static void PrintHelloWorld(){
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine();
        scan.close();
        System.out.println("Hello, World");
        System.out.println(inputString);
    }
}



