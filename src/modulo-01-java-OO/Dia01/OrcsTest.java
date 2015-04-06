

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
       }
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
         @Test
        public void orcRecebeUmAtack(){
            //Arrange - Montagem dos dados de testes
            Orcs umOrc=new Orcs();
            int esperado=100;
            int resultadoObtido = umOrc.recebeDano();
            
            assertEquals(resultadoObtido, esperado);
            //Act - Execução da ação de testes
            //Assert - Verifica se o resultado é o esperado
            
            
    }
    
    //teste no orck ele recebe 2 atack
        @Test
        public void orcRecebeDoisAtack(){
            //Arrange - Montagem dos dados de testes
            Orcs umOrc=new Orcs();
            int esperado=90;
            int resultadoObtido;
            resultadoObtido= umOrc.recebeDano();
            resultadoObtido= umOrc.recebeDano();
            assertEquals(resultadoObtido, esperado);
            //Act - Execução da ação de testes
            //Assert - Verifica se o resultado é o esperado
            
    }
    //teste no orck ele recebe 5 atack
        @Test
        public void orcRecebeCincoAtack(){
            //Arrange - Montagem dos dados de testes
            Orcs umOrc=new Orcs();
            int esperado=60;
            int resultadoObtido;
            resultadoObtido= umOrc.recebeDano();
            resultadoObtido= umOrc.recebeDano();
            resultadoObtido= umOrc.recebeDano();
            resultadoObtido= umOrc.recebeDano();
            resultadoObtido= umOrc.recebeDano();
            assertEquals(resultadoObtido, esperado);
            //Act - Execução da ação de testes
            //Assert - Verifica se o resultado é o esperado
            
            
    }
    }