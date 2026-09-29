public class patternPrinting1 {
    public static void main(String[] args) {
        patternPrinting1(5);
    }
    static void patternPrinting1(int n)
    {
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
