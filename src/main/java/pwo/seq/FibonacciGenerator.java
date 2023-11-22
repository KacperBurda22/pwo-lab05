package pwo.seq;

import java.math.BigDecimal;

/**
 * Implementacja generatora ciągu Fibonacciego.
 * Klasa rozszerza abstrakcyjną klasę Generator.
 * FibonacciGenerator jest inicjowany wartościami początkowymi 0 i 1.
 * Każde wywołanie metody nextTerm() generuje kolejny element ciągu Fibonacciego.
 *
 * @author student
 * @version 1.0.0
 */
public class FibonacciGenerator extends Generator {

    /**
     * Konstruktor klasy FibonacciGenerator.
     * Inicjuje początkowe wartości ciągu Fibonacciego.
     */
    public FibonacciGenerator() {
        current = new BigDecimal(0);
        f_1 = new BigDecimal(1);
        f_2 = new BigDecimal(0);
    }

    /**
     * Resetuje generator, przywracając początkowe wartości ciągu Fibonacciego.
     */
    @Override
    public void reset() {
        super.reset();
        current = new BigDecimal(0);
        f_1 = new BigDecimal(1);
        f_2 = new BigDecimal(0);
    }

    /**
     * Generuje i zwraca kolejny element ciągu Fibonacciego.
     * Aktualizuje wartości f_1, f_2 i current, aby przygotować się do generacji kolejnego elementu.
     *
     * @return Kolejny element ciągu Fibonacciego w postaci obiektu BigDecimal.
     */
    @Override
    public BigDecimal nextTerm() {

        if (lastIndex > 1) {
            current = f_1.add(f_2);
            f_2 = f_1;
            f_1 = current;
        } else if (lastIndex == 1) {
            current = new BigDecimal(1);
        } else {
            current = new BigDecimal(0);
        }

        lastIndex++;
        return current;
    }
}
