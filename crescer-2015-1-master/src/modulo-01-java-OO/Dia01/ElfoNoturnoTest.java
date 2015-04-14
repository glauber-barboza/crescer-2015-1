

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ElfoNoturnoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ElfoNoturnoTest
{
    
    private final double DELTA = 0.05;
    
    /**
     * Default constructor for test class ElfoNoturnoTest
     */
    public ElfoNoturnoTest()
    {
    }

    @Test
    public void ElfoNoturnoAtacaUmaVez() {
        ElfoNoturno elfoNoturno=new ElfoNoturno("Tio Patinhas");
        Orc shureck=new Orc();
        
        elfoNoturno.elfoNorutnoAtaca(shureck);
        
        double vidaEsperada= elfoNoturno.getVida();
        int experienciaExperada= elfoNoturno.getExperiencia();
       
        assertEquals(95, vidaEsperada,DELTA);
        
        assertEquals(3, experienciaExperada);
    }
    
     @Test
    public void ElfoNoturnoAtacaDuasVezes() {
        ElfoNoturno elfoNoturno=new ElfoNoturno("Tio Patinhas");
        Orc shureck=new Orc();
        
        elfoNoturno.elfoNorutnoAtaca(shureck);
        elfoNoturno.elfoNorutnoAtaca(shureck);
        
        double vidaEsperada= elfoNoturno.getVida();
        int experienciaExperada= elfoNoturno.getExperiencia();
       
        assertEquals(90.25, vidaEsperada, DELTA);
        
        assertEquals(6, experienciaExperada);
    }
    
     @Test
    public void ElfoNoturnoAtacaDezVezes() {
        ElfoNoturno elfoNoturno=new ElfoNoturno("Tio Patinhas");
        Orc shureck=new Orc();
        
        elfoNoturno.elfoNorutnoAtaca(shureck);
        elfoNoturno.elfoNorutnoAtaca(shureck);
        elfoNoturno.elfoNorutnoAtaca(shureck);
        elfoNoturno.elfoNorutnoAtaca(shureck);
        elfoNoturno.elfoNorutnoAtaca(shureck);
        elfoNoturno.elfoNorutnoAtaca(shureck);
        elfoNoturno.elfoNorutnoAtaca(shureck);
        elfoNoturno.elfoNorutnoAtaca(shureck);
        elfoNoturno.elfoNorutnoAtaca(shureck);
        elfoNoturno.elfoNorutnoAtaca(shureck);
        
        double vidaEsperada= elfoNoturno.getVida();
        int experienciaExperada= elfoNoturno.getExperiencia();
       
        assertEquals(59.87, vidaEsperada, DELTA);
        
        assertEquals(30, experienciaExperada);
    }
    
       @Test
    public void ElfoNoturnoAtacaAteMorrer() {
        ElfoNoturno elfoSuicida = new ElfoNoturno("Night Legolas");
        Status statusEsperado = Status.MORTO;

        for (int i = 0; i < 90; i++){
            elfoSuicida.elfoNorutnoAtaca(new Orc());
        }
        Status obtido = elfoSuicida.getStatus();

        assertEquals(statusEsperado, obtido);
    }
}
