public class ReverseAString344 {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
    }
    static void reverseString(char[] s)
    {
        int left =0;
        int right = s.length-1;

        while(left<right)
        {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}

/*  REVERSE A STRING - TWO POINTER - LEETCODE 344
*   TIME COMPLEXITY = O(n)
*   SPACE COMPLEXXITY = O(1)*/