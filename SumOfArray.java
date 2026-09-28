public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = { 2,3,1,4};
        System.out.print(arraySum(arr));
    }
    static int arraySum(int[] arr)
    {
        int sum =0;

        for (int i = 0; i < arr.length; i++) {
           sum+=arr[i];
        }
        return sum;
    }
}
