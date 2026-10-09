import java.util.Scanner;

public class EvenAndOddDigitsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int evenSum =0;
        int oddSum =0;

        while(n!=0)
        {
            int digit = n%10;
            if(digit%2==0)
            {
                evenSum+=digit;
            } else {
                oddSum+=digit;
            }
            n = n/10;
        }
        System.out.println(evenSum+" "+oddSum);
    }
}
