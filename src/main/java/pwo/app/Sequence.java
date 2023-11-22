/*
 * Klasa Sequence reprezentuje główną klasę aplikacji do generowania ciągów matematycznych.
 */
package pwo.app;

/**
 * Główna klasa aplikacji Sequence, obsługująca różne przypadki użycia zależnie od liczby argumentów wejściowych.
 * Uruchamia odpowiednią aplikację w zależności od liczby przekazanych argumentów.
 *
 * @author student
 * @version 1.0.0
 */
public class Sequence {

    /**
     * Metoda główna aplikacji Sequence.
     * Analizuje liczbę argumentów wejściowych i uruchamia odpowiednią aplikację w zależności od tej liczby.
     *
     * @param args Tablica argumentów wejściowych przekazanych do aplikacji.
     */
    public static void main(String[] args) {
        switch (args.length) {
            case 3:
                (new SeqToOutApp()).run(args);
                break;
            case 4:
                (new SeqToFileApp()).run(args);
                break;
            default:
                System.out.println("!Illegal arguments\n" + "Legal usage: seqName from to [fileName]");

        }
    }
}

