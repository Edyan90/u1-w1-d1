import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        System.out.println("----------------------------------------- SCANNER -----------------------------------------------");
        Scanner scanner = new Scanner(System.in); // Creazione di un oggetto di tipo Scanner, ci serve per chiedere degli input all'utente
        // System.in serve per dire allo Scanner di leggere ciò che l'utente scrive nel terminale

        System.out.println("Ciao inserisci una parola");
        String primaParola = scanner.nextLine();

        System.out.println("Ciao per favore inserisci la seconda parola");
        String secondaParola = scanner.nextLine();

        System.out.println("Ora per favore inserisci la terza parola");
        String terzaParola = scanner.nextLine();

        System.out.println("La frase è: " + primaParola + " " + secondaParola + " " + terzaParola);

        scanner.close(); // Anche se non servirebbe in questo caso alla fine di tutto è sempre bene chiudere lo scanner
    }

}

