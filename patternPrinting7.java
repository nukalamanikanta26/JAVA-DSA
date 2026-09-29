public class patternPrinting7 {
    public static void main(String[] args) {
    pattern7(5);
    }
    static void pattern7(int n) {

        for (int i = 1; i <= n; i++) {
            System.out.print("*"+" ");
        }
        System.out.println();

        for (int j = 1; j <= n-2; j++) {
            System.out.print("*"+" ");

            for (int k = 1; k <= n-2; k++) {
                System.out.print("  ");
            }
            System.out.println("*");
        }

        for (int i = 1; i <= n; i++) {
            System.out.print("*"+" ");
        }
        System.out.println();
    }
}
