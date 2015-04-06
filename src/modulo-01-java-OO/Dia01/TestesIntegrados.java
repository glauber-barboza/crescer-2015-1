

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TestesIntegrados.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestesIntegrados
{
 /**
     * Default constructor for test class TestesIntegrados
     */
    public TestesIntegrados()
    {
    }
  @Test
    public void umElfoAtiraEmDoisOrcs() {
        // Arrange
        Elfo elfo = new Elfo();
        Orc orc1 = new Orc();
        Orc orc2 = new Orc();
        // Act
        elfo.atirarFlecha(orc1);
        elfo.atirarFlecha(orc2);
        // Assert
        int experienciaEsperada = 2;
        int flechasEsperadas = 40;
        int vidaEsperadaOrc1 = 110;
        int vidaEsperadaOrc2 = 110;
        
        assertEquals(experienciaEsperada, elfo.getExperiencia());
        assertEquals(flechasEsperadas, elfo.getFlechas());
        assertEquals(vidaEsperadaOrc1, orc1.getVida());
        assertEquals(vidaEsperadaOrc2, orc2.getVida());
    }
    }

