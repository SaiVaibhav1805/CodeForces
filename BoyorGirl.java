import java.util.Scanner;

public class BoyorGirl {
    static String solution(String s){
        int cnt=0;
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=' '){
                freq[ch-'a']++;
            }
        }
            for(int i=0;i<freq.length;i++){
                if(freq[i]>0){
                    cnt+=1;
            }
        }
        if(cnt%2==0){
            return "CHAT WITH HER!";
        }
        else{
            return "IGNORE HIM!";
        }
    }

    //  236/A
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(solution(s));
        sc.close();
    }
}
