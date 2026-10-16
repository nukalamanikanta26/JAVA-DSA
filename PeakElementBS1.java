public class PeakElementBS1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println(peakElement(arr));
    }
    static int peakElement(int[] arr)
    {
        int n = arr.length;
       int res=0;

       if(n==0)
       {
           return -1;
       }
       if(n==1)
       {
           return 0;
       }
        if(arr[0]>arr[1])
        {
            return 0;
        }
        if(arr[n-1]>arr[n-2])
        {
            return n-1;
        }
        for (int i = 1; i <= n-2 ; i++) {

            if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
            {
                res = i;
                return res;
            }
        }
        return -1;
    }
}


/* PEAK ELEMENT - BRUTE FORCE - LEET CODE 162
 *  TIME COMPLEXITY = O( n)
 *  SPACE COMPLEXITY = O(1) */