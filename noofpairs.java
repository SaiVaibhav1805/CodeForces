import java.util.Arrays;
import java.util.Scanner;

public class noofpairs { 
    // 1538/C

    static long count(int[] arr, int x) {

        int left = 0;
        int right = arr.length - 1;

        long count = 0;

        while (left < right) {

            if (arr[left] + arr[right] <= x) {

                count += right - left;
                left++;

            } else {

                right--;
            }
        }

        return count;
    }

    static long Solution(int n, int[] arr, int l, int r) {

        Arrays.sort(arr);

        long rightCount = count(arr, r);
        long leftCount = count(arr, l - 1);

        return rightCount - leftCount;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            int n = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();

            int[] arr = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }

            System.out.println(Solution(n, arr, l, r));
        }

        sc.close();
    }
}