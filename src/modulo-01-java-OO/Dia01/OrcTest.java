

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A classe de teste OrcTest.
 *
 * @author  (seu nome)
 * @version (um número de versão ou data)
 */
public class OrcTest
{
    @Test
    public void orcNasceCom110Vida() {
        // Arrange - Montagem dos dados de teste
        Orc umOrc;
        // Act - Execução da ação de testes
        umOrc = new Orc("Bazinga");
        // Assert - Verificação
        int esperado = 110;
        int resultadoObtido = umOrc.getVida();
        
        assertEquals(esperado, resultadoObtido);
    }
    
    @Test
    public void orcRecebeAtaqueUmaVez() {
        // Arrange - Montagem dos dados de teste
        Orc umOrc = new Orc("Bazinga");
        // Act
        umOrc.recebeDano();
        // Assert - Verificação
        int esperado = 100;
        int resultadoObtido = umOrc.getVida();
        
        assertEquals(esperado, resultadoObtido);
    }
    
    @Test
    public void orcRecebeAtaqueDuasVezes() {
        // Arrange - Montagem dos dados de teste
        Orc umOrc = new Orc("Bazinga");
        // Act
        umOrc.recebeDano();
        umOrc.recebeDano();
        // Assert - Verificação
        int esperado = 90;
        int resultadoObtido = umOrc.getVida();
        
        assertEquals(esperado, resultadoObtido);
    }
    
    @Test
    public void orcRecebeAtaqueCincoVezes() {
        // Arrange - Montagem dos dados de teste
        Orc umOrc = new Orc("Bazinga");
        // Act
        umOrc.recebeDano();
        umOrc.recebeDano();
        umOrc.recebeDano();
        umOrc.recebeDano();
        umOrc.recebeDano();
        // Assert - Verificação
        int esperado = 60;
        int resultadoObtido = umOrc.getVida();
        
        assertEquals(esperado, resultadoObtido);
    }
    
    @Test
    public void orcRecebeAtaqueDozeVezes() {
        // Arrange - Montagem dos dados de teste
        Orc umOrc = new Orc("Bazinga");
        // Act
      umOrc.recebeDano();
      umOrc.recebeDano();
      umOrc.recebeDano();
      umOrc.recebeDano();
      umOrc.recebeDano();
      umOrc.recebeDano();
      umOrc.recebeDano();
      umOrc.recebeDano();
      umOrc.recebeDano();
      umOrc.recebeDano();
      umOrc.recebeDano();
      umOrc.recebeDano();
     
        // Assert - Verificação
        int esperado = -10;
        int resultadoObtido = umOrc.getVida();
        
        assertEquals(esperado, resultadoObtido);
    }
          @Test
        public void orcNascecomVida(){
            //Arrange - Montagem dos dados de testes
            Orc umOrc=new Orc("Bazinga");
            int esperado=110;
            int resultadoObtido = umOrc.getVida();
            
            assertEquals(resultadoObtido, esperado);
            //Act - Execução da ação de testes
            //Assert - Verifica se o resultado é o esperado
            
            
    }
         @Test
        public void orcRecebeUmAtack(){
            //Arrange - Montagem dos dados de testes
            Orc umOrc=new Orc("Bazinga");
            int esperado=100;
            umOrc.recebeDano();
            int resultadoObtido=umOrc.getVida();
            assertEquals(resultadoObtido, esperado);
            //Act - Execução da ação de testes
            //Assert - Verifica se o resultado é o esperado
            
            
    }
    
    //teste no orck ele recebe 2 atack
        @Test
        public void orcRecebeDoisAtack(){
            //Arrange - Montagem dos dados de testes
            Orc umOrc=new Orc("Bazinga");
            int esperado=90;
            int resultadoObtido;
            umOrc.recebeDano();
            umOrc.recebeDano();
            resultadoObtido= umOrc.getVida();
            assertEquals(resultadoObtido, esperado);
            //Act - Execução da ação de testes
            //Assert - Verifica se o resultado é o esperado
            
    }
    //teste no orck ele recebe 5 atack
        @Test
        public void orcRecebeCincoAtack(){
            //Arrange - Montagem dos dados de testes
            Orc umOrc=new Orc("Bazinga");
            int esperado=60;
            int resultadoObtido;
            umOrc.recebeDano();
            umOrc.recebeDano();
            umOrc.recebeDano();
            umOrc.recebeDano();
            umOrc.recebeDano();
            resultadoObtido= umOrc.getVida();
            assertEquals(resultadoObtido, esperado);
            //Act - Execução da ação de testes
            //Assert - Verifica se o resultado é o esperado
            
            
    }
    
    @Test
    public void orcToStringRetornaVidaPadrao(){
    Orc orc=new Orc("Bazinga");
    
    String resultadoObtido= orc.toString();
    String esperado= "Vida atual: 110";
    assertEquals(resultadoObtido, esperado);
    }
      @Test
    public void orcToStringRetornaVidaAposAtack(){
    Orc orc=new Orc("Bazinga");
    orc.recebeDano();
    String resultadoObtido= orc.toString();
    String esperado= "Vida atual: 100";
    assertEquals(resultadoObtido, esperado);
    }
    @Test
    public void orcRecebeAtacComNumeroGeradoMenorQueZero(){
    Orc umOrc=new Orc("Tom");
    umOrc.recebeDano();
    int vidaEsperada=100;
    int xpEsperada=0;
    
    assertEquals(vidaEsperada, umOrc.getVida());
    assertEquals(xpEsperada, umOrc.getExperiencia());
    }
      @Test
    public void orcRecebeAtacComNumeroEntre0e100(){
    Orc umOrc=new Orc("Tom Bombardeiro");
    umOrc.recebeDano();
    umOrc.set1Xp();
    int vidaEsperada=100;
    int xpEsperada=1;
    
    assertEquals(vidaEsperada, umOrc.getVida());
    assertEquals(xpEsperada, umOrc.getExperiencia());
    }
       @Test
    public void orcRecebeAtacComNumeroMaiorQue100(){
    Orc umOrc=new Orc("Tom Bombardeiro");
    umOrc.recebeDano();
    umOrc.set1Xp();
    umOrc.set1Xp();
    int vidaEsperada=100;
    int xpEsperada=2;
    
    assertEquals(vidaEsperada, umOrc.getVida());
    assertEquals(xpEsperada, umOrc.getExperiencia());
    }
}




