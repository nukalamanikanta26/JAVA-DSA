
public class DiamondTraversal
{
	public static void main(String[] args) {
	    
	    int[][] arr = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

	    int n = arr.length;
	    
	    int i = 0;
	    int j=(n-1)/2;
	    while(i<=(n-1)/2 && j<=n-1)
	    {
	        System.out.print(arr[i][j]+" ");
	        i++;
	        j++;
	    }
	    
	    i = ((n-1)/2)+1;
	    j=n-2;
	    
	    while (i<=n-1 && j>=(n-1)/2)
	    {
	        System.out.print(arr[i][j]+" ");
	        i++;
	        j--;
	    }
	    
	    i = n-2;
	    j=((n-1)/2)-1;
	    
	    while(i>=(n-1)/2 && j>=0)
	    {
	        System.out.print(arr[i][j]+" ");
	        i--;
	        j--;
	    }
	    
	    i =((n-1)/2)-1;
	    j=1;
	    
	    while(i>=1 && j<((n-1)/2)-1)
	    {
	        System.out.print(arr[i][j]+" ");
	        i--;
	        j++;
	    }
	}
}
