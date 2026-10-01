public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {1,4,2,8,3};
        System.out.println(secLargest(arr));
    }
    static int secLargest(int[] arr)
    {
      int max = Integer.MIN_VALUE;
      int sm = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
          if(arr[i]>max)
          {
              sm = max;
              max = arr[i];
          } else if (arr[i]<max &&arr[i]>sm) {
              sm = arr[i];
          }
        }
        return sm;
    }
}
