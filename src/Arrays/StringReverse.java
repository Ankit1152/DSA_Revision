package Arrays;


// GFG problem
public class StringReverse {
    public static void main(String[] args) {
        String str = "Geeks";
        String str1 = "for";
        System.out.println(reverseString(str1));
    }

    public static String reverseString(String str) {
        if(str == null || str.length() <= 1){
            return str;
        }

        char newStr[] = str.toCharArray();
        int start=0, end = newStr.length-1;

       while (start < end) {
        char temp = newStr[start];
        newStr[start] = newStr[end];
        newStr[end] = temp;

        start++;
        end--;
       }

       return new String(newStr);
    }
}
