package es.upm.miw.iwvg.forge.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FractionTest {

    @Test
    void testIsPropia() {
        assertTrue(new Fraction(1, 5).isPropia());
    }

    @Test
    void testIsImpropia() {
        assertTrue(new Fraction(10, 2).isImpropia());
    }
}
