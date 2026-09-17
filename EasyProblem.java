import java.util.*;
public class EasyProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] responses=new int[n];
        for(int i=0;i<n;i++){
            responses[i]=sc.nextInt();
        }
        int cnt=0;
        for(int i=0;i<n;i++){
            if(responses[i]==1){
                cnt++;
            }
        }
        if(cnt>=1){
            System.out.print("hard");
        }
        else{
            System.out.print("easy");
        }
        sc.close();
    }
}
