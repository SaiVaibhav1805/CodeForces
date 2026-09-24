import java.util.Scanner;

public class serejaandDima { 
    //  381/A
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean Sereja=true;
        int sumSereja=0;
        int sumDima=0;
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            int val=0;
            if(arr[i]>arr[j]){
                val=arr[i];
                i++;
            }
            else{
                val=arr[j];
                j--;
            }
            if(Sereja){
                sumSereja+=val;
            }
            else{
                sumDima+=val;
            }
            Sereja=!Sereja;
        }
        System.out.println(sumSereja+ " "+sumDima);
        sc.close();
    }
}
