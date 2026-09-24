import java.util.*;

public class Books {

    static int Solution(int n, int t, int[] time) {

        int i = 0;
        int sum = 0;
        int max = 0;

        for(int j = 0; j < n; j++) {

            sum += time[j];

            while(sum > t) {
                sum -= time[i];
                i++;
            }

            max = Math.max(max, j - i + 1);
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();

        int[] time = new int[n];

        for(int i = 0; i < n; i++) {
            time[i] = sc.nextInt();
        }

        System.out.println(Solution(n, t, time));

        sc.close();
    }
}