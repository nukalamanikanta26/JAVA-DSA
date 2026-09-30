public class ContainerWithMostWater1 {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
    static int maxArea(int[] height)
    {
        int l =0;
        int r = height.length-1;
        int maxArea =0;
        while(l<r)
        {
            int length = Math.min(height[l],height[r]);
            int breadth = r-l;

            int area = length * breadth;
            maxArea = Math.max(area,maxArea);

            if(height[l]<height[r])
            {
                l++;
            }
            else {
                r--;
            }
        }
        return maxArea;
    }
}

/* CONATINER WITH MOST WATER - LEETCODE 11 - TWO POINTER
 *  TIME COMPLEXITY : O(n)
 *  SPACE COMPLEXITY : O(1)  */