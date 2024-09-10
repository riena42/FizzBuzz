public class Reduce {
    public static void main(int i) {
        int n = 0;
        while (i>0) {
            if (i % 2 == 0) {
                i = i / 2;
            }
            else {
                i = i - 1;
            }
            n++;
        }
        System.out.println(n);
    }
}
