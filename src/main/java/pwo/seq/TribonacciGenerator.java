package pwo.seq;

import java.math.BigDecimal;

/**
 * Implementacja generatora ciągu Tribonacciego, rozszerzająca klasę FibonacciGenerator.
 * Ciąg Tribonacciego to rozszerzenie ciągu Fibonacciego, gdzie trzy pierwsze elementy wynoszą 0, 1, 1.
 *
 * @author student
 * @version 1.0.0
 */
public class TribonacciGenerator extends FibonacciGenerator {

    /**
     * Konstruktor klasy TribonacciGenerator.
     * Inicjuje początkową wartość trzeciego elementu ciągu Tribonacciego.
     */
    public TribonacciGenerator() {
        f_3 = new BigDecimal(0);
    }

    /**
     * Resetuje generator, przywracając początkowe wartości ciągu Tribonacciego.
     */
    @Override
    public void reset() {
        super.reset();
        f_3 = new BigDecimal(0);
    }

    /**
     * Generuje i zwraca kolejny element ciągu Tribonacciego.
     * Aktualizuje wartości f_1, f_2, f_3 i current, aby przygotować się do generacji kolejnego elementu.
     *
     * @return Kolejny element ciągu Tribonacciego w postaci obiektu BigDecimal.
     */
    @Override
    public BigDecimal nextTerm() {
        if (lastIndex > 2) {
            current = f_1.add(f_2).add(f_3);
            f_3 = f_2;
            f_2 = f_1;
            f_1 = current;
        } else if (lastIndex == 2) {
            current = new BigDecimal(1);
        } else {
            current = new BigDecimal(0);
        }
        lastIndex++;
        return current;
    }
}

