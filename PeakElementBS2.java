public class PeakElementBS2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println(peakElement(arr));
    }
    static int peakElement(int[] arr)
    {
        int low = 0;
        int high = arr.length-1;

        while(low<=high)
        {
            int mid = low +(high-low)/2;

            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
            {
                return mid;
            } else if (arr[mid-1]>arr[mid])
            {
              high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return -1;
    }
}

/* PEAK ELEMENT - BINARY SEARCH - LEET CODE 162
 *  TIME COMPLEXITY = O( n)
 *  SPACE COMPLEXITY = O(1) */