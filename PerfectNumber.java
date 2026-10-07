public class PerfectNumber {
    public static void main(String[] args) {
        int n = 28;
        System.out.println(isPerfectNumber(n));
    }
    static  boolean isPerfectNumber(int n)
    {
        int sum =1;
        for (int i = 2; i <n ; i++) {
            if(n%i==0)
            {
                sum = sum+i;
            }
        }
        return sum==n;
    }
}
