import libraries.In;
import libraries.Out;

public class ue02_2 {
    public static void main(String[] args) {

        System.out.println("please enter a year");
        int year = In.readInt();
        System.out.println("please enter a month");
        int month = In.readInt();
        int days = 0;

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                days = 31;
                break;

            case 4, 6, 9, 11:
                days = 30;

            case 2:
                if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;

            default:
                System.out.println("you have entered something wrong");
                break;
        }
        System.out.println(days);

    }
}

/*
 * Erstellen Sie ein Java-Programm, welches eine Jahreszahl und einen
 * Monats-Wert zwischen 1 und 12 einliest und die Anzahl der Tage des
 * zugehörigen Monats wieder ausgibt. Verwenden Sie eine
 * „switch/case“-Anweisung.
 * Beachten Sie auch die Schaltjahres-Regel für den Februar: Ein Schaltjahr ist
 * alle vier Jahre, jedoch alle 100 Jahre nicht, dann aber alle 400 Jahre doch.
 * Beispiel Schaltjahre: 1988, 2000, 2020
 * Beispiel Nicht-Schaltjahre: 1900, 1999, 2022
 * Überprüfen Sie auch, ob die eingegebenen Werte im gültigen Bereich liegen,
 * und geben Sie ansonsten eine Fehlermeldung aus
 */
