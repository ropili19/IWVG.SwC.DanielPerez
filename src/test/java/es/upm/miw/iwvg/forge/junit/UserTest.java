package es.upm.miw.iwvg.forge.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    @Test
    public void testUpper() {
        assertEquals("PEDRO REYES", new User(0, "Pedro", "Reyes").upper());
    }
}
