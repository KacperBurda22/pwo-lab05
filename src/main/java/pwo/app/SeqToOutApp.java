/*
 * Klasa SeqToOutApp jest rozszerzeniem klasy SeqToFileApp i reprezentuje aplikację wiersza poleceń
 * do generowania i wyświetlania ciągów matematycznych w terminalu.
 */
package pwo.app;

import pwo.utils.SequenceTools;

/**
 * Aplikacja SeqToOutApp służy do generowania i wyświetlania ciągów matematycznych w terminalu.
 * Rozszerza funkcjonalność klasy SeqToFileApp.
 *
 * @author student
 * @version 1.0.0
 */
public class SeqToOutApp extends SeqToFileApp {

    /**
     * Analizuje argumenty wejściowe, dziedzicząc część funkcjonalności z klasy nadrzędnej SeqToFileApp.
     * Sprawdza, czy argumenty są poprawne i wystarczające do uruchomienia aplikacji.
     *
     * @param args Tablica argumentów wejściowych przekazanych do aplikacji.
     * @return True, jeśli argumenty są poprawne; w przeciwnym razie false.
     */
    @Override
    protected boolean getArgs(String[] args) {
        if (super.getArgs(args)) {
            return true;
        }

        return seqType != null && from >= 0 && to >= 0;
    }

    /**
     * Wyświetla wygenerowany ciąg matematyczny w terminalu, korzystając z narzędzi do obsługi ciągów matematycznych.
     *
     * @return True, jeśli operacja zapisu ciągu do terminala zakończyła się powodzeniem; w przeciwnym razie false.
     */
    @Override
    protected boolean wirteSeq() {
        System.out.println(SequenceTools.getTermsAsColumn(
                seqType.getGenerator(), from, to));

        return true;
    }

    /**
     * Metoda uruchamiająca aplikację wiersza poleceń SeqToOutApp.
     * Wyświetla informację powitalną, analizuje argumenty wejściowe i wykonuje odpowiednie akcje.
     *
     * @param args Tablica argumentów wejściowych przekazanych do aplikacji.
     */
    @Override
    public void run(String[] args) {
        System.out.println("Sequence to terminal CLI app");

        if (!getArgs(args)) {
            System.out.println("!Illegal arguments\n" + "Legal usage: seqName from to");
            return;
        }

        wirteSeq();
    }

}
