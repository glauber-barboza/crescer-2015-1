

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class OrcsTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class OrcsTest
{
    /**
     * Default constructor for test class OrcsTest
     */
    public OrcsTest()
    {   
        @Test
        public void orcNascecomVida(){
            //Arrange - Montagem dos dados de testes
            Orcs umOrc=new Orcs();
            int esperado=110;
            int resultadoObtido = umOrc.getVida();
            
            assertEquals(resultadoObtido, esperado);
            //Act - Execução da ação de testes
            //Assert - Verifica se o resultado é o esperado
            
            
    }

       }
    }