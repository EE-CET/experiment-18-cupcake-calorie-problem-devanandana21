import java.util.Scanner;

public class Cupcake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] calories = new int[n];
        boolean[] used = new boolean[n];

        for (int i = 0; i < n; i++) {
            calories[i] = sc.nextInt();
        }

        long totalMiles = 0;
        int power = 0;

        for (int count = 0; count < n; count++) {
            int maxVal = -1;
            int idx = -1;

            for (int i = 0; i < n; i++) {
                if (!used[i] && calories[i] > maxVal) {
                    maxVal = calories[i];
                    idx = i;
                }
            }

            used[idx] = true;
            totalMiles += (long) maxVal * (1L << power);
            power++;
        }

        System.out.print(totalMiles);
    }
}
