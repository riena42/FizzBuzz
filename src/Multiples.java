public class Multiples {
    public static void main(String[] args) {
        int n = 0;
        for (int i = 1; i < 1000; i++) {
            boolean div3 = i % 3 == 0;
            boolean div5 = i % 5 == 0;

            if (div3) {
                n++;
                //System.out.println(i);
            } else if (div5) {
                n++;
                //System.out.println(i);
            }
        }
        System.out.println(n);

    }
}
