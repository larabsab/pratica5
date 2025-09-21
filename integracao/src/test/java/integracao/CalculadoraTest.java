package integracao;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculadoraTest {

    @Test
    public void deveSomarDoisNumeros() {
        // ARRANGE
        Calculadora calc = new Calculadora();
        int a = 5, b = 3;

        // ACT
        int resultado = calc.somar(a, b);

        // ASSERT
        assertEquals(8, resultado);
    }

    @Test
    public void deveSubtrairDoisNumeros() {
        // ARRANGE
        Calculadora calc = new Calculadora();

        // ACT
        int resultado = calc.subtrair(10, 4);

        // ASSERT
        assertEquals(6, resultado);
    }
}
