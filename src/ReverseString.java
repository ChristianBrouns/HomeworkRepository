/**
 * Created by Christian on 5-1-2016.
 */
public class ReverseString {
    public static String input(String str) {
        String input = "The cat sat on the bank ";
        int length = input.length();
        for (int i = length - 1; i >= 0; i--) {
            input = input + input.charAt(i);
        }
        return input;
    }

    public static void main(String[] args) {
        System.out.println(ReverseString.input("... "));
    }
}


/*
Schijf een methode dat prints een String omgekeerd  to System.out    
Als de input voor de methode is “The cat sat on the bank”i then the output is: knab eht no tas tac ehT   
Tip:  look up the System class for methode print en the String class for the method charAt. 
The  length of a String is beschikbaar met de methode length();  
 */