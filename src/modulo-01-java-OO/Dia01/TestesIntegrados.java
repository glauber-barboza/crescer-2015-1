

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
        Orc orc1 = new Orc("Bazinga");
        Orc orc2 = new Orc("Bazinga2");
        // Act
         elfo.atirarFlechaOrc(orc1);
          elfo.atirarFlechaOrc(orc2);
        // Assert
        int experienciaEsperada = 2;
        int flechasEsperadas = 40;
        int vidaEsperadaOrc1 = 100;
        int vidaEsperadaOrc2 = 100;
        
        assertEquals(experienciaEsperada, elfo.getExperiencia());
        assertEquals(flechasEsperadas, elfo.getFlechas());
        assertEquals(vidaEsperadaOrc1, orc1.getVida());
        assertEquals(vidaEsperadaOrc2, orc2.getVida());
    }
    }

