import java.util.*;
public class KefaandFirstSteps {
    static int solution(int n,int[] arr){
        if(n==1){
            return 1;
        }
        int cnt=1;
        int i=0;
        int j=i+1;
        int maxi=0;
        while(i<n && j<n){
            if(arr[i]<=arr[j]){
                cnt+=1;
            }
            else{
                cnt=1;
            }
            maxi=Math.max(maxi,cnt);
            i++;
            j++;
        }
        return maxi;
    }

  //     580/A

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // no.of days
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(solution(n,arr));
        
        sc.close();
    }
}
