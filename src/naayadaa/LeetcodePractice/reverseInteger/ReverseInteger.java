package naayadaa.LeetcodePractice.reverseInteger;

/**
 Input: 123
 Output:  321

 Input: -123
 Output: -321

 Input: 120
 Output: 21

 Note:
 Assume we are dealing with an environment which could only hold integers within the 32-bit signed integer range.
 For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 */

public class ReverseInteger {

    public static int reverse(int x) {

        String s = Integer.toString(x);
        boolean isPositive = x > 0;

        //forget about minus
        if(!isPositive){
            s = s.replace("-","");
        }

        char[] charX = s.toCharArray();

        //reverse char array
        for (int i = 0; i < charX.length/2; i++){
            char temp = charX[i];
            charX[i] = charX[charX.length - i - 1];
            charX[charX.length - i - 1] = temp;
        }

        //add minus if it's needed
        s = isPositive ? new String(charX) : ("-" + new String(charX));

        try{

            x = Integer.parseInt(s);

        }catch (NumberFormatException e){
            return 0;
        }

        return x;
    }

    public static void main(String[] args) {
        System.out.println(reverse(2147483647));
        System.out.println(reverse(-123));
        System.out.println(reverse(120));
        System.out.println(reverse(-6120));
    }
}
