import java.util.HashSet;
import java.util.Scanner;

public class horseshoeonotherroof {
    static int solution(int[] arr){
        int n=arr.length;
        HashSet<Integer> unq=new HashSet<>();
        for(int i=0;i<n;i++){
            unq.add(arr[i]);
        }

        int ans=Math.abs(n-unq.size());
        return ans;
    }



  //  228/A
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[4];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(solution(arr));
        sc.close();
    }
}
