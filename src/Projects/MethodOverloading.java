package Homework2;

/**
 * Created by Christian on 9-1-2016.
 */
public class MethodOverloading {

    int sumValues(int a, int b){
        return a+b;

    }
    double sumValues(double a, double b){
        return a+b;
    }

    public static void main(String[] args) {
        MethodOverloading om = new MethodOverloading();
        System.out.println(om.sumValues(4, 5));
        System.out.println(om.sumValues(4.0, 5.2));
    }

}

