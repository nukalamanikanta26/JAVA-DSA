public class FloorAndCeilOfNumBS2 {
    public static void main(String[] args) {
        int[] arr = {1,2,8,10,12,19};
        int x =5;
        System.out.println("Floor: "+floor(arr,x)+" "+"Ceil :"+ ceil(arr,x));
    }
    static int floor(int[] arr, int x)
    {
        int low =0;
        int high = arr.length-1;
        int answer =-1;
        while(low<=high)
        {
            int mid = low + (high-low)/2;

            if(arr[mid]==x)
            {
                return arr[mid];
            } else if (arr[mid]>x)
            {
                high=mid-1;

            }else {
                low = mid+1;
                answer=arr[mid];
            }
        }
        return answer;
    }
    static int ceil(int[] arr,int x)
    {
        int low =0;
        int high = arr.length-1;
        int answer=-1;

        while(low<=high)
        {
            int mid = low + (high-low)/2;

            if(arr[mid]==x)
            {
                return arr[mid];
            } else if (arr[mid]>x)
            {
               high=mid-1;
               answer=arr[mid];
            }else{
                low=mid+1;
            }
        }
        return answer;
    }
}


/* FLOOR AND CEIL OF NUMBER IN SORTED ARRAY - BINARY SEARCH
 *  TIME COMPLEXITY = O( log n)
 *  SPACE COMPLEXITY = O(1) */