public class patternPrinting6 {
    public static void main(String[] args) {
        patter6(5);
    }
    static void patter6(int n)
    {
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
