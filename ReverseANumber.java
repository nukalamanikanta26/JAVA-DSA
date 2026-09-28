public class ReverseANumber {
    public static void main(String[] args) {
        int rev =0;
        int num = 3241;

        while(num!=0){
            int lastDigit = num % 10;
            rev = rev*10 + lastDigit;
            num /= 10;
        }
        System.out.println(rev);
    }
}
