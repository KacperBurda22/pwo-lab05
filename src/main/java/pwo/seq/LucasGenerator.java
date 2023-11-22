package pwo.seq;

import java.math.BigDecimal;

/**
 * Implementacja generatora ciągu Lucasa, rozszerzająca klasę FibonacciGenerator.
 * Ciąg Lucasa to modyfikacja ciągu Fibonacciego, gdzie pierwsze dwa elementy wynoszą 2.
 *
 * @author student
 * @version 1.0.0
 */
public class LucasGenerator extends FibonacciGenerator {

    /**
     * Konstruktor klasy LucasGenerator.
     * Inicjuje początkowe wartości ciągu Lucasa.
     */
    public LucasGenerator() {
        current = new BigDecimal(2);
        f_2 = new BigDecimal(2);
    }

    /**
     * Resetuje generator, przywracając początkowe wartości ciągu Lucasa.
     */
    @Override
    public void reset() {
        super.reset();
        current = new BigDecimal(2);
        f_2 = new BigDecimal(2);
    }

    /**
     * Generuje i zwraca kolejny element ciągu Lucasa.
     * W przypadku pierwszego wywołania metody zwraca wartość 2, a następnie korzysta z logiki klasy bazowej (FibonacciGenerator).
     *
     * @return Kolejny element ciągu Lucasa w postaci obiektu BigDecimal.
     */
    @Override
    public BigDecimal nextTerm() {
        if (lastIndex == 0) {
            lastIndex++;
            return new BigDecimal(2);
        }
        return super.nextTerm();
    }
}

