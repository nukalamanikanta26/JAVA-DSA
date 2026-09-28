public class EvenSum {
    public static void main(String[] args) {
        int[] arr = {2,4,5,3,1};
        System.out.println(eveSum(arr));
    }
    static int eveSum(int[] arr)
    {
        int sum =0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0)
            {
                sum+=arr[i];
            }
        }
        return sum;
    }
}
