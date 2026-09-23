import java.util.Arrays;
import java.util.Scanner;

public class Paintthenumbers {
    
    static int Solution(int n,int[] arr){
        Arrays.sort(arr);
        boolean[] visited=new boolean[n];
        int div=0;
        for(int i=0;i<n;i++){
            if(visited[i]){
                continue;
            }
            div++;
            for(int j=i;j<n;j++){
                if(arr[j]%arr[i]==0){
                    visited[j]=true;
                }
            }

        }


        return div;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Solution(n,arr));
        sc.close();
    }
}
