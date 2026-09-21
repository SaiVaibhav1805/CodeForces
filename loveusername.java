import java.util.*;

public class loveusername {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int first = sc.nextInt();

        int min = first;
        int max = first;

        int count = 0;

        for(int i = 1; i < n; i++) {

            int x = sc.nextInt();

            if(x > max) {
                max = x;
                count++;
            }

            else if(x < min) {
                min = x;
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}