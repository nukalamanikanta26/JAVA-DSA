import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
    int[] arr = {3,4,5,1,2};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
    static int[] selectionSort(int[] arr)
    {
        int n = arr.length;

        for (int i = 0; i < n-1; i++)
        {
            int minIndex = i;
            for (int j = i; j < n ; j++)
            {
                if(arr[j]<arr[minIndex])
                {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex]= temp;
        }
        return arr;
    }
}

/*Selection sort Tc = O(n^2) . SC = O(1)*/