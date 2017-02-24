/**
 * Created by raymond on 17-1-13.
 */
public class FizzBizz {
    public static void fizzBizz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println("Fizz");
            }
            if (i % 5 == 0 && i % 3 != 0) {
                System.out.println("Bizz");
            }
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBizz");
            }
            if (i % 3 != 0 && i % 5 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        fizzBizz(100);
    }
}
