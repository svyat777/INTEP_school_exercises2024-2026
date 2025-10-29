import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter numer: ");
        double user_number = sc.nextDouble(); 
        if(user_number < 10 && user_number == 10){
            System.out.println("this book is cheap");
        }else{
            System.out.println("this book is expensive");
        }

        
    }
}
