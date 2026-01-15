import java.util.*;

public class Cupcake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        long result = 0;
        int power = 0;

        boolean[] used = new boolean[n];

        for (int count = 0; count < n; count++) {
            int max = -1;
            int idx = -1;

            for (int i = 0; i < n; i++) {
                if (!used[i] && arr[i] > max) {
                    max = arr[i];
                    idx = i;
                }
            }

            used[idx] = true;
            result += (long) max * (1L << power);
            power++;
        }

        System.out.print(result);
    }
}
