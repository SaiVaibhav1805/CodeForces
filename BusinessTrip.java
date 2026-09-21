import java.util.Arrays;
import java.util.Scanner;


// 149/A

public class BusinessTrip {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int[] months=new int[12];
        for(int i=0;i<months.length;i++){
            months[i]=sc.nextInt();
        }
        if(k==0){
            System.out.println(0);
            return;
        }
        Arrays.sort(months);
        int cnt=0;
        int sum=0;
        for(int i=11;i>=0;i--){
            sum+=months[i];
            cnt++;
            if(sum>=k){
                break;
            }
        }
        if(sum>=k){
             System.out.println(cnt);
        }
        else{
             System.out.println(-1);
        }
        sc.close();
    }
}
