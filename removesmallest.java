import java.util.Arrays;
import java.util.Scanner;

public class removesmallest {

    static String solution(int n,int[] arr){
        Arrays.sort(arr);
        for(int i=1;i<n;i++){
            if(arr[i]-arr[i-1]>1){
                return "NO";
            }
        }
        return "YES";
    }

    // 1399/A - Remove Smallest
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int j=0;j<n;j++){
                a[j]=sc.nextInt();
            }
            System.out.println(solution(n,a));
        }

        sc.close();

    }
}
