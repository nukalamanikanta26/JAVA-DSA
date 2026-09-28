public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(4
        ));
    }
    static boolean isPrime(int n)
    {
        int count =0;
        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
