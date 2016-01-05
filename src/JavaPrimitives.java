/**
 * Created by Christian on 5-1-2016.
 */
public class JavaPrimitives {
    public static void main(String[] args) {
        int a = 10;
        int b = 0xFF;
        int c = 0b101;
        int d = 1000_1;
        float e = 5.67f;
        double f = 6.78;
        long huge = 88888888888l;
        char g = '€';
        boolean on = true;
        boolean off = false;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(huge);
        System.out.println(g);
        System.out.println(on);
        System.out.println(off);
    }
}


/*
Java primitives    
De 8 primitieven in java zijn…  
byte, short,int, long,  float, double, char en boolean.  
Ik kan de  volgende schrijven in java.   
int a = 010  ;   
int b = 0xFF; 
int c = 0b101; 
int d = 1000_1;  
float e = 5.67f;    // ( float e = 5.67 is niet toegestaan !) 
double f = 6.78; 
long ​huge = ​88888888888l​ ; 
char ​ g = ​ '​ \u20ac​ '​ ; 
boolean on = true;  // ( boolean on = 1 is niet toegestaan) 
boolean off= false; 
     
Schrijf een class dat prints de bovenstaande waarden. 
Dan voor uitleg over waarom die zijn  toegestaan lees het volgende …     
​java primitives   
Dit is belangrijk voor je exam dus lees het goed ! 

*/