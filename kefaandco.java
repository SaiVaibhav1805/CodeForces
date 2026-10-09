import java.util.Arrays;
import java.util.Scanner;

public class kefaandco {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int[][] friends=new int[n][2];
        for(int i=0;i<n;i++){
            friends[i][0]=sc.nextInt();
            friends[i][1]=sc.nextInt();
        }
        Arrays.sort(friends,(a,b)->Integer.compare(a[0], b[0]));
        long sum=0;
        long max=0;
        int left=0;
        for (int right = 0; right < n; right++) {
            sum += friends[right][1];

            while (friends[right][0] - friends[left][0] >= d) {
                sum -= friends[left][1];
                left++;
            }

            max = Math.max(max, sum);
        }

        System.out.println(max);
    
        sc.close();

    }
}
