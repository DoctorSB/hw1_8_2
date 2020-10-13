package Hello;

import java.util.Scanner;

class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N, sum = 0;
            N = scanner.nextInt();
        while (N % 2 != 1 || N <= 25 || N >= 100);
        for (int i = 25; i < N; i++) {
            if (i % 2 == 0) sum += i;
        }
        System.out.print(sum);
    }
}