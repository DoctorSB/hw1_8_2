package Hello;

import java.util.Scanner;

public class first {

    public static void main(String[] args) {
        int sum = 0, number;
        Scanner scanner = new Scanner(System.in);

        number = scanner.nextInt();
        if (number > 10) {
            sum += number;
            {
                while (number % 5 != 0) ;

                System.out.println(sum);
            }
        }
    }
}