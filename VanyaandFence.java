import java.util.*;
public  class VanyaandFence{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); //no of friends
        int h=sc.nextInt(); //height of the fence
        int[] heights=new int[n]; //heights og each person;
        for(int i=0;i<n;i++){
            heights[i]=sc.nextInt();
        }
        int width=0;
        for(int i=0;i<n;i++){
            if(heights[i]>h){
                width+=2;
            }
            else{
                width+=1;
            }
          
        }
        System.out.print(width);
        sc.close();
    }
}