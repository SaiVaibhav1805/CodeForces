import java.util.*;

public class LuckyDivision {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (check(n, 4) || check(n, 7)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

        sc.close();
    }

    static boolean check(int n, int lucky) {

        if (lucky > n)
            return false;

        if (n % lucky == 0)
            return true;

        return check(n, lucky * 10 + 4) ||
               check(n, lucky * 10 + 7);
    }
}