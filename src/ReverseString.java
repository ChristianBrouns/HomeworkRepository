/**
 * Created by Christian on 5-1-2016.
*/
/*
Een String omkeren to System.out      
 */

public class ReverseString {
    public static String input(String str) {

        int length = str.length();
        for (int i = length - 1; i >= 0; i--) {
            str = str + str.charAt(i);
        }
        return str;
    }

    public static void main(String[] args) {
        for (int n = 0; n < args.length; n++)
        System.out.println(ReverseString.input(args[n]));
    }
}
