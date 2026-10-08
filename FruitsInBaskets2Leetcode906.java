import java.util.HashMap;

public class FruitsInBaskets2Leetcode906 {
    public static void main(String[] args) {
        int[] fruits = {0,1,2,2};
        int  basket = 2;
        System.out.println(maxFruitsInBasket(fruits,basket));
    }
    static int maxFruitsInBasket(int[] fruits,int baskets)
    {
        int maxFruits=0;
        int left=0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int right = 0; right < fruits.length; right++)
        {
          map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);

          while(map.size()>2)
          {
              map.put(fruits[left],map.get(fruits[left])-1);

              if(map.get(fruits[left])==0)
              {
                  map.remove(fruits[left]);
              }
              left++;
          }

          maxFruits = Math.max(maxFruits,right-left+1);
        }
        return maxFruits;
    }
}

/*
 * FRUITS IN BASKET - SLIDING WINDOW - APPROACH 2
 *  TIME COMPLEXITY = O(n)
 *  SPACE COMPLEXITY = O(b) : since, in set only 2 elements added irrespective of input*/