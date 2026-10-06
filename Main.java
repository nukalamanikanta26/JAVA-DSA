
public class Main
{
    public static void main(String[] args) {
        String s = "MANI";
        System.out.println(revAString(s));
    }
    static String revAString(String str)
    {
        String rev="";
        char[] arr = str.toCharArray();
        int start =0;
        int end = arr.length-1;

        while(start<end)
        {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        String s = new String(arr);
        return s;
    }
}