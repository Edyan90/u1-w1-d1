public class ex1 {
    public static void main(String[] args) {
        System.out.println("----------------------------------------- ex1-----------------------------------------------");
        int risultatoMolt = moltiplicazione(2, 3);
        System.out.println("il risultato della moltiplicazione è: " + risultatoMolt);

        System.out.println("----------------------------------------- spazio-----------------------------------------------");
        String conc = concatenazione(6, " bellissima");
        System.out.println(conc);

        System.out.println("----------------------------------------- spazio-----------------------------------------------");
        String[] originalArray = {"zero", "uno", "due", "tre", "quattro"};
        String newString = "inserita";

        String[] resultArray = arraydiStringhe(originalArray, newString);

        // Stampa dell'array risultante
        for (String str : resultArray) {
            System.out.println(str);
        }

    }

    public static int moltiplicazione(int num1, int num2) {
        return num1 * num2;
    }

    public static String concatenazione(int numero, String stringa) {
        return numero + stringa;
    }

    public static String[] arraydiStringhe(String[] array, String stringa) {
        String[] newArray = new String[6];

        // Copia dei primi due elementi
        newArray[0] = array[0];
        newArray[1] = array[1];

        // Inserimento della nuova stringa al terzo posto
        newArray[2] = stringa;

        // Copia degli elementi successivi
        newArray[3] = array[2];
        newArray[4] = array[3];
        newArray[5] = array[4];

        return newArray;
    }

}
