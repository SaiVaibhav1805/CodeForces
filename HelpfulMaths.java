import java.util.*;
public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String res="";
        int size=0;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                size=size+1;
            }
        }
        int[] arr=new int[size];
        int j=0;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                arr[j]=s.charAt(i)-'0';
                j++;
            }
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(i>0){
                res=res+"+";
            }
            res+=arr[i];
        }
        System.out.print(res);
        sc.close();
    }
}
