/**
 * Created by Christian on 5-1-2016.
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

/*
Schijf een methode dat prints een String omgekeerd  to System.out    
Als de input voor de methode is “The cat sat on the bank”i then the output is: knab eht no tas tac ehT   
Tip:  look up the System class for methode print en the String class for the method charAt. 
The  length of a String is beschikbaar met de methode length();  
 */