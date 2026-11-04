import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {7,5,9,3,1,2};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
    static int[] bubbleSort(int[] arr)
    {
        int n = arr.length;

        for (int i = 0; i < n-1; i++)
        {
            for (int j = 0; j <= n-i-2; j++)
            {
              if(arr[j]>arr[j+1])
              {
                  int temp = arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1] = temp;
              }
            }
        }
        return arr;
    }
}

/* Bubble Sort */