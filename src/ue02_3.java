import libraries.In;
import libraries.Out;

public class ue02_3 {
    public static void main(String[] args) {

        System.out.println("please enter a x corrdinate");
        double x = In.readDouble();
        System.out.println("please enter a y coordinate");
        double y = In.readDouble();

        if (x > 0 && y > 0 && x * y < 16 && x * y <= Math.pow(4, 2) * Math.PI) {
            System.out.println("in circle");
        } else {
            System.out.println("not in circle");
        }

    }
}

/*
 * Gegeben ist ein Kreis mit dem Radius r = 4 und dem Mittelpunkt (0,0):
 * Schreiben Sie ein Java-Programm, das die x- und y-Koordinaten (double)
 * eines Punktes einliest und feststellt, ob der Punkt innerhalb der grünen
 * Fläche
 * liegt.
 * Überlegen Sie eine sinnvolle Abfolge der zu prüfenden Bedingungen.
 * Anmerkung: √𝑥 = Math.sqrt(x
 */
