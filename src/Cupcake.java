import java.util.*;

public class Cupcake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        long sum = 0;
        int j = 0;

        for (int i = n - 1; i >= 0; i--) {
            sum += (long) a[i] * (1L << j);
            j++;
        }

        System.out.println(sum);
    }
}
