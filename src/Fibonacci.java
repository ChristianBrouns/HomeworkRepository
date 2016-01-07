/**
 * Created by Christian on 5-1-2016.
 */
public class Fibonacci {

   public static int fibonacci(int number) {
        if ((number == 0) || (number == 1))
            return number;
        else
            return fibonacci(number - 1) + fibonacci(number - 2);
    }
    public static void main(String[] args) {
        int input = 20;
        for (int counter = 0; counter <= input; counter++){
            System.out.print(" " + fibonacci(counter));
        }
    }
}
/*

Fibonacci sequence  
De fibonacci sequence is …   
0,1,1,2,3,5,8,13,21,..  ( 0 +1 = 1, 1+1=2,1+2=3,2+3=5,3+5=8,5+8=13,8+13=21….)     
Schrijf een java class dat prints out de eerste x fibonacci sequence nummers. 
Dus parameter  voor je methode is  een int voor de eerste x fibonacci sequence nummers. 
Als je hem aanroept  met 5 dan jouw methode moet uitprinten    0,1,1,2,3 
als je hem  aanroept met 6   0,1,1,2,3,5   enz... 

 */