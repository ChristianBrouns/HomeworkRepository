/**
 * Created by Christian on 5-1-2016.
 */
public class Factorial {

    public static int calculate(int n) {
        int result = 1;
           for (int i = 1; i <= n; i++) {
            result = result * i;
        }
    return result;
    }

    public static void main(String[] args) {
        System.out.println(Factorial.calculate(3));

    }
}


/*
Factorial van een nummer   
Schrijf een java class met een methode dat geeft terug de factorial van een nummer. 
De methode heeft een parameter met type int. 
De return type van de methode is int.   

uitleg… 
factoial van 0 is 1;  factorial van 3 is 3*2*1 = 6; 
factorial 5 = 5*4*3*2 = 120   enz… 

 */