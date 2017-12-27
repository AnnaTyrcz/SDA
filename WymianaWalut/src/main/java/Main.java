import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner SC = new Scanner(System.in);
        String Text = "";
        String[] splitedArray;
        String waluta;

        URL oracle = new URL("http://api.fixer.io/latest");
        URLConnection yc = oracle.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
        String inputLine;

        while ((inputLine = in.readLine()) != null)
            Text = inputLine;
        in.close();

        Text = (Text.substring(43));
        Text = (Text.replace("}", ""));
        Text = (Text.replace("\"", ""));
        Text = (Text.replace(",", ":"));
        Text = Text + ":EUR:1";
        splitedArray = Text.split(":");

        System.out.println("Co chcesz zrobić? ");
        System.out.println("1: Wypisz kursy walut");
        System.out.println("2: wypisz jeden kurs");
        System.out.println("3: przelicz wartość");

        String selection = SC.nextLine();
        int number = Integer.parseInt(selection);

        switch (number) {
            case 1:
                for (String aSplitedArray : splitedArray) {
                    System.out.println(aSplitedArray + " ");
                }
                break;
            case 2:
                for (int i = 0; i < splitedArray.length; i += 2) {
                    System.out.print(splitedArray[i] + " ");
                }
                System.out.println("");
                System.out.println("Podaj walutę np. PLN ");
                waluta = SC.nextLine();

                for (int i = 0; i < splitedArray.length; i++) {
                    if (waluta.toUpperCase().equals(splitedArray[i])) {
                        System.out.println();
                        System.out.print("Obecny kurs " + "\n" + splitedArray[i] + " " + splitedArray[i + 1]);
                    }
                }
                break;
            case 3:
                for (int i = 0; i < splitedArray.length; i += 2) {
                    System.out.print(splitedArray[i] + " ");
                }
                System.out.println("");
                System.out.println("Podaj walutę którą chcesz wymienić np. PLN ");
                String waluta1 = SC.nextLine();
                System.out.println("Ile masz " + waluta1.toUpperCase() + "?");
                String ilosc = SC.nextLine();
                System.out.println("Na jaką walutę chcesz wymienić?");
                String waluta2 = SC.nextLine();

                float wynik;
                float wWaluta1 = 0;
                float wWaluta2 = 0;
                float ilosc2 = Float.parseFloat(ilosc);

                for (int i = 0; i < splitedArray.length; i++) {
                    if (waluta1.toUpperCase().equals(splitedArray[i])) {
                        System.out.println("Obecny kurs " + "\n" + splitedArray[i] + " " + splitedArray[i + 1]);
                        wWaluta1 = Float.parseFloat(splitedArray[i + 1]);
                    }
                    if (waluta2.toUpperCase().equals(splitedArray[i])) {
                        System.out.println("Obecny kurs " + "\n" + splitedArray[i] + " " + splitedArray[i + 1]);
                        wWaluta2 = Float.parseFloat(splitedArray[i + 1]);
                    }
                }
                wynik = ((ilosc2 / wWaluta1) * wWaluta2);
                System.out.println("za " + ilosc2 + " " + waluta1.toUpperCase() + " otrzymasz " + wynik + " " + waluta2.toUpperCase());

                break;
            default:
                System.out.println("Nie prawidłowy wybór ");
        }
    }
}