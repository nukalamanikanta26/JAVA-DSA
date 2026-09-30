public class maxElement {
    public static void main(String[] args) {
        int[] arr = {2,3,1,5};
        System.out.println(MaxElement(arr));
    }
    static int MaxElement(int[] arr)
    {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        return max;
    }
}
