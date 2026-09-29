public class patternPrinting4 {
    public static void main(String[] args) {
        patternPrinting(5);
    }
    static void patternPrinting(int n)
    {
      int sum = (n*(n-1))/2;

        for (int i = 1; i<n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(sum+" ");
                sum--;
            }
            System.out.println();
        }
    }
}
