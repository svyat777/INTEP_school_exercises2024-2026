import java.util.Scanner;


public class glassorsoglass {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter only one letter: ");
        char user_letter = scanner.next().charAt(0);

        if ("aeiouAEIOUаеёиоуыэюяАЕЁИОУЫЭЮЯ".indexOf(user_letter) != -1) {
            System.out.println("ur letter is vowel");
        } else {
            System.out.println("ur letter is consonant");
        }

    }
}