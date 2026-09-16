import java.util.*;
public class beautifulmatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[5][5];
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int row=0;
        int col=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(arr[i][j]==1){
                    row=i;
                    col=j;
                }
            }
        }
        int distance=Math.abs(row-2)+Math.abs(col-2);
        System.out.print(distance);
        sc.close();        
    }
}
