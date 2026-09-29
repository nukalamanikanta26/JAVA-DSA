class PatternPrinting2 {
    public static void main(String[] args) {
        patternPrinting2(5);
    }
    static void patternPrinting2(int n)
    {
        for (int i = n; i>=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
