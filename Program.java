import  java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //your code goes here
        
        Scanner sc = new Scanner(System.in);

        int celcius = sc.nextInt();

        if(celcius >= 100) {
        System.out.println("Boiling");
        }
        else {
        System.out.println("Not Boiling");
        }

        
    }
}