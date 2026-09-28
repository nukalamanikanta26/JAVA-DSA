public class PerfectNum {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(155));
    }
    static boolean isPerfectNumber(int n)
    {
        int sum =0;

        for (int i = 1; i < n-1; i++) {

            if(n%i==0)
            {
                sum+=i;
            }
        }
        return sum==n;
    }
}
