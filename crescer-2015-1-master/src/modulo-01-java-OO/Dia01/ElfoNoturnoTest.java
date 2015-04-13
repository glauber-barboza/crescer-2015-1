

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
        
        int vidaEsperada= elfoNoturno.getVida();
        int experienciaExperada= elfoNoturno.getExperiencia();
       
        assertEquals(95, vidaEsperada);
        
        assertEquals(3, experienciaExperada);
    }
    
     @Test
    public void ElfoNoturnoAtacaDuasVezes() {
        ElfoNoturno elfoNoturno=new ElfoNoturno("Tio Patinhas");
        Orc shureck=new Orc();
        
        elfoNoturno.elfoNorutnoAtaca(shureck);
        elfoNoturno.elfoNorutnoAtaca(shureck);
        
        int vidaEsperada= elfoNoturno.getVida();
        int experienciaExperada= elfoNoturno.getExperiencia();
       
        assertEquals(90, vidaEsperada);
        
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
        
        int vidaEsperada= elfoNoturno.getVida();
        int experienciaExperada= elfoNoturno.getExperiencia();
       
        assertEquals(57, vidaEsperada);
        
        assertEquals(30, experienciaExperada);
    }
    
       @Test
    public void ElfoNoturnoAtacaAteMorrer() {
        ElfoNoturno elfoNoturno=new ElfoNoturno("Tio Patinhas");
        Orc shureck=new Orc();
         Status status= elfoNoturno.getStatus();
         
        for(int i=0;i <=100;i++){
        elfoNoturno.elfoNorutnoAtaca(shureck);
      }
      
        int vidaEsperada= elfoNoturno.getVida();
        int experienciaExperada= elfoNoturno.getExperiencia();
        assertEquals(0, vidaEsperada);
        
        assertEquals(status.MORTO, status);
    }
}
