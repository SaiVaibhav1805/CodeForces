import java.util.*;

public class GourmetCat {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int fish = sc.nextInt();
        int rabbit = sc.nextInt();
        int chicken = sc.nextInt();

        int weeks = Math.min(fish / 3,
                Math.min(rabbit / 2, chicken / 2));

        int ans = weeks * 7;

        fish -= weeks * 3;
        rabbit -= weeks * 2;
        chicken -= weeks * 2;

        int[] days = {0, 1, 2, 0, 2, 1, 0};

        for (int start = 0; start < 7; start++) {

            int f = fish;
            int r = rabbit;
            int c = chicken;

            int count = 0;

            for (int i = 0; i < 7; i++) {

                int day = days[(start + i) % 7];

                if (day == 0 && f > 0) {
                    f--;
                    count++;
                }
                else if (day == 1 && r > 0) {
                    r--;
                    count++;
                }
                else if (day == 2 && c > 0) {
                    c--;
                    count++;
                }
                else {
                    break;
                }
            }

            ans = Math.max(ans, weeks * 7 + count);
        }

        System.out.println(ans);
    }
}