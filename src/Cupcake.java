import java.util.*;

public class Cupcake{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] calories = new long[n];

        for (int i = 0; i < n; i++) {
            calories[i] = sc.nextLong();
        }

        // Sort ascending
        Arrays.sort(calories);

        long miles = 0;
        long power = 1; // 2^0

        // Traverse from largest to smallest
        for (int i = n - 1; i >= 0; i--) {
            miles += calories[i] * power;
            power *= 2;
        }

        System.out.println(miles);
        sc.close();
    }
}
