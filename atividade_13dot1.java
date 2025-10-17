import java.util.Scanner;
public class atividade_13dot1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result;
        System.out.print("enter first number: ");
        int user_first_number = input.nextInt(); 
        System.out.print("enter operator(-,/,*,+): ");
        char user_operator = input.next().charAt(0);
 
        System.out.print("enter second number: ");
        int user_second_number = input.nextInt(); 

        if(user_operator == '+'){
            result = user_first_number + user_second_number;
            System.out.println("result is: " + result);
        }else if(user_operator == '-'){
            result = user_first_number - user_second_number;
            System.out.println("result is: " + result);
        }else if(user_operator == '/'){
            result = user_first_number / user_second_number;
            System.out.println("result is: " + result);
        }else if(user_operator == '*'){
            result = user_first_number * user_second_number;
            System.out.println("result is: " + result);
        }else{
            System.out.println("error: invalid operator");
        }

    }
}


