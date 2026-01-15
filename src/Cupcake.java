import java.util.Scanner;
import java.util.Arrays;

public class Cupcake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] calories = new int[n];

        for (int i = 0; i < n; i++) {
            calories[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(calories);

        long miles = 0;
        int power = 0;

        for (int i = n - 1; i >= 0; i--) {
            miles += (long) calories[i] * (1L << power);
            power++;
        }

        System.out.println(miles);
    }
}
