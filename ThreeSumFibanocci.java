/*Q1. Three Fibonacci Sum

You are given an integer n.
The Fibonacci sequence starts with 0 and 1, and each subsequent number is the sum of the previous two numbers.
Its first few terms are 0, 1, 1, 2, 3, 5, 8, 13, ....
Return true if n can be expressed as the sum of three consecutive terms in the
Fibonacci sequence, and false otherwise.

Example 1:
Input: n = 16

Output: true
Explanation: The three consecutive terms 3, 5, and 8 have a sum of 3 + 5 + 8 = 16.*/
public class ThreeSumFibanocci {
    public static void main(String[] args) {
        int n =16;
        System.out.println(threeSumFibo(n));
    }
    static boolean threeSumFibo(int n)
    {
        int a =0;
        int b =1;
        int c =1;

        while(a+b+c<=n)
        {
            if(a+b+c==n)
            {
                return true;
            }

            int next = b+c;
            a=b;
            b=c;
            c = next;
        }
        return false;
    }
}
