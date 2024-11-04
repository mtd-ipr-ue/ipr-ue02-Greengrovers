import libraries.In;
import libraries.Out;

public class outprintMax {
    public static void main(String[] args) {
        System.out.println("Plese enter the first number");
        int number1 = In.readInt();

        System.out.println("please enter the second number");
        int number2 = In.readInt();

        System.out.println("please enter the secont number");
        int number3 = In.readInt();

        if (number1 > number2 && number1 > number3) {
            System.out.println("max= " + number1);
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("max= " + number2);
        } else if (number3 > number1 && number3 > number2) {
            System.out.println("max= " + number3);
        } else if (number1 == number2 && number2 == number3) {
            System.out.println("all numbers are equal");
        }
    }
}

/*
 * Erstellen Sie ein Java-Programm, welches drei ganze Zahlen (int) einliest und
 * das Maximum der drei Werte ausgibt
 */
