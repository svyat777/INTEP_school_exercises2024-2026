import java.util.Scanner;
public class atividade_5dot1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter number: ");
        int user_number = input.nextInt(); 
        
        switch (user_number) {
            case 1:
            System.out.println("today is monday");
                break;
            case 2:
            System.out.println("today is Tuesday ");
                break;
            case 3:
            System.out.println("today is Wednesday ");
                break;
            case 4:
            System.out.println("today is Thursday ");
                break;
            case 5:
            System.out.println("today is Friday ");
                break;
            case 6:
            System.out.println("today is Saturday ");
                break;
            case 7:
                System.out.println("today is Sunday ");
                break;
            default:
                System.out.println("Invalid number");
        }

        
    }
}


