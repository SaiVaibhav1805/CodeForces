import java.util.Scanner;

public class Yetanothersubarrayproblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        long ans=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int l=0;l<n;l++){
            long sum=0;
            for(int r=l;r<n;r++){
                sum+=arr[r];
                int length=r-l+1;
                long pen=k*((length + m-1)/m);
                long cost=sum-pen;
                ans=Math.max(cost,ans);
            }
        }
        System.out.println(ans);


        sc.close();
    }
}
