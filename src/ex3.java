import java.util.Scanner;

import static java.lang.Math.sqrt;

public class ex3 {
    public static void main(String[] args) {
        System.out.println("----------------------------------------- SCANNER -----------------------------------------------");
        Scanner scanner = new Scanner(System.in); // Creazione di un oggetto di tipo Scanner, ci serve per chiedere degli input all'utente
        // System.in serve per dire allo Scanner di leggere ciò che l'utente scrive nel terminale

        System.out.println("Ciao, inserisci lato 1 del rettangolo");
        float lato1 = Float.parseFloat(scanner.nextLine());

        System.out.println("Ciao, per favore inserisci il lato 2");
        float lato2 = Float.parseFloat(scanner.nextLine());

        System.out.println("Il perimetro del rettangolo è: " + perimetroRettangolo(lato1, lato2));

        System.out.println("Ciao, ora inserisci un numero e ti dirò se è pari(0) o dispari(1)");
        int num1 = Integer.parseInt(scanner.nextLine());

        System.out.println("il numero è Pari se 0, Disparo se 1: " + pariDispari(num1));

        System.out.println("Ciao, ora inserisci latoA per calcolare l'area del triangolo");
        double latoA = Double.parseDouble(scanner.nextLine());
        System.out.println("Ciao, ora inserisci latoB per calcolare l'area del triangolo");
        double latoB = Double.parseDouble(scanner.nextLine());
        System.out.println("Ciao, ora inserisci latoC per calcolare l'area del triangolo");
        double latoC = Double.parseDouble(scanner.nextLine());
        System.out.println("l'area del triangolo è: " + areaTriangolo(latoA, latoB, latoC));
        scanner.close(); // Anche se non servirebbe in questo caso alla fine di tutto è sempre bene chiudere lo scanner
    }

    public static float perimetroRettangolo(float lato1, float lato2) {
        return 2 * (lato1 + lato2);
    }

    public static int pariDispari(int num1) {
        if (num1 % 2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static double areaTriangolo(double latoA, double latoB, double latoC) {
        double semiperimetro = (latoA + latoB + latoC) / 2;
        double area = sqrt(semiperimetro * (semiperimetro - latoA) * (semiperimetro - latoB) * (semiperimetro - latoC));
        return area;
    }
}



