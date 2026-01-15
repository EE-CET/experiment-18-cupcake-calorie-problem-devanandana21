import java.util.*;

public class Cupcake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        long result = 0;
        int power = 0;

        for (int i = n - 1; i >= 0; i--) {
            result += (long) arr[i] * (1L << power);
            power++;
        }

        System.out.print(result);
    }
}
