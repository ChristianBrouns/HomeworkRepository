package Homework2;

/**
 * Created by Christian on 9-1-2016.
 */
public class SwitchStatement {
    public static void main(String[] args) {
        int number = 8;
        String monthname;
        switch (number) {
            case 1:
               monthname = "januari";
                break;
            case 2:
                monthname = "februari";
                break;
            case 3:
                monthname = "march";
                break;
            case 4:
                monthname = "april";
                break;
            case 5:
                monthname = "may";
                break;
            case 6:
                monthname = "june";
                break;
            case 7:
                monthname = "july";
                break;
            case 8:
                monthname = "august";
                break;
            case 9:
                monthname = "september";
                break;
            case 10:
                monthname = "october";
                break;
            case 11:
                monthname = "november";
                break;
            case 12:
                monthname = "december";
                break;
            default:
                monthname = "invalid monthnumber";
                break;
        }

        System.out.println("the name of the month = " + (monthname));
    }
}




//Switch (byte, short, int, char, Stringof Enum) {
// }
// bijvoorbeeld int result = 5
// Switch(result){
// case: 1
// case: 2
// case: 3
// default]
// print alle volgende vanaf de case die waar is. Tenzij er volgt "break;"
//Schrijf java class die gebruik maakt van Switch en die converteert 1 t/m 12 met de naam van de maand.