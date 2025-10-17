import java.util.Scanner;
public class atividade_13dot1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double result;
        System.out.print("enter first number: ");
        double user_first_number = input.nextDouble(); 
        System.out.print("enter operator(-,/,*,+): ");
        char user_operator = input.next().charAt(0);
 
        System.out.print("enter second number: ");
        double user_second_number = input.nextDouble(); 

        switch (user_operator) {
            case '-':
            result = user_first_number - user_second_number;
            System.out.println("result is: " + result);
                break;
            case '+':
            result = user_first_number + user_second_number;
            System.out.println("result is: " + result);
                break;
            case '/':
            result = user_first_number / user_second_number;
            System.out.println("result is: " + result);
                break;
            case '*':
            result = user_first_number * user_second_number;
            System.out.println("result is: " + result);
            default:
                System.out.println("Invalid operator");
        }

    }
}


