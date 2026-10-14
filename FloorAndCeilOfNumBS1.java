public class FloorAndCeilOfNumBS1 {
    public static void main(String[] args) {
    int[] arr = {1,2,8,10,12,19};
    int x =5;
    floorAndCeil(arr,x);
    }
    static void floorAndCeil(int[] arr, int x)
    {
        int floor=-1;
        int ceil =-1;

        for (int i = 0; i < arr.length; i++) { // TC : O(n)

            if(arr[i]==x)
            {
                floor = arr[i];
                break;
            } else if(arr[i]>x)
            {
                floor = arr[i-1];
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) //TC : O(n)
        {
            if(arr[i]==x || arr[i]>x)
            {
                ceil=arr[i];
                break;
            }
        }
        System.out.println("Floor :"+floor + " Ceil :"+ceil);
    }
}

/* FLOOR AND CEIL OF NUMBER IN SORTED ARRAY - BINARY SEARCH
 *  TIME COMPLEXITY = O( n)
 *  SPACE COMPLEXITY = O(1) */