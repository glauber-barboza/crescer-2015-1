import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Testes unitários para a classe Elfo.
 *
 * @author  CWI Software
 */
public class ElfoTest
{
    @Test
    public void elfoNasceComNomeInformado() {
        // Arrange
        String esperado = "Celeborn";        
        // Act
        Elfo elfo = new Elfo(esperado);
        // Assert
        assertEquals(esperado, elfo.getNome());
    }
    
    @Test
    public void elfoNasceComNomeVazio() {
        // Arrange
        String esperado = "";        
        // Act
        Elfo elfo = new Elfo(esperado);
        // Assert
        assertEquals(esperado, elfo.getNome());
    }
    
    @Test
    public void elfoNasceComNomeNulo() {
        // Arrange
        String esperado = null;        
        // Act
        Elfo elfo = new Elfo(esperado);
        // Assert
        assertEquals(esperado, elfo.getNome());
    }
    
    @Test
    public void elfoNasceCom42FlechasPorPadrao() {
        // Arrange
        int esperado = 42;
        // Act
        Elfo elfo = new Elfo("um nome qualquer");
        // Assert
        assertEquals(esperado, elfo.getFlechas());
    }
    
    @Test
    public void elfoNasceComNomeEMuitasFlechasInformados() {
        // Arrange
        String nomeEsperado = "Robin";
        int flechasEsperadas = 567853;
        // Act
        Elfo elfo = new Elfo(nomeEsperado, flechasEsperadas);
        // Assert
        assertEquals(nomeEsperado, elfo.getNome());
        assertEquals(flechasEsperadas, elfo.getFlechas());
    }
    
    @Test
    public void elfoNasceComNomeEPoucasFlechasInformados() {
        // Arrange
        String nomeEsperado = "Robin";
        int flechasEsperadas = 12;
        // Act
        Elfo elfo = new Elfo(nomeEsperado, flechasEsperadas);
        // Assert
        assertEquals(nomeEsperado, elfo.getNome());
        assertEquals(flechasEsperadas, elfo.getFlechas());
    }
    
    @Test
    public void elfoNasceComNomeEFlechasNegativasInformados() {
        // Arrange
        String nomeEsperado = "Robin";
        int flechasEsperadas = -567853;
        // Act
        Elfo elfo = new Elfo(nomeEsperado, flechasEsperadas);
        // Assert
        assertEquals(nomeEsperado, elfo.getNome());
        assertEquals(flechasEsperadas, elfo.getFlechas());
    }
    
    @Test
    public void elfoAtiraFlechaEmUmOrc() {
        // Arrange
        Elfo elfo = new Elfo("Legolas");
        Orc orc = new Orc();
        // Act
        elfo.atirarFlecha(orc);
        // Assert
        int experienciaEsperada = 1;
        int flechasEsperadas = 41;
        
        assertEquals(experienciaEsperada, elfo.getExperiencia());
        assertEquals(flechasEsperadas, elfo.getFlechas());
    }
    
    @Test
    public void elfoAtiraFlechasDuasVezesNoMesmoOrc() {
        // Arrange
        Elfo elfo = new Elfo("Legolas");
        Orc orc = new Orc();
        // Act
        elfo.atirarFlecha(orc);
        elfo.atirarFlecha(orc);
        // Assert
        int experienciaEsperada = 2;
        int flechasEsperadas = 40;
        
        assertEquals(experienciaEsperada, elfo.getExperiencia());
        assertEquals(flechasEsperadas, elfo.getFlechas());
    }
    
    @Test
    public void elfoAtiraFlechasCincoVezesNoMesmoOrc() {
        // Arrange
        Elfo elfo = new Elfo("Legolas", 4);
        Orc orc = new Orc();
        // Act
        elfo.atirarFlecha(orc);
        elfo.atirarFlecha(orc);
        elfo.atirarFlecha(orc);
        elfo.atirarFlecha(orc);
        elfo.atirarFlecha(orc);
        // Assert
        int experienciaEsperada = 5;
        int flechasEsperadas = -1;
        
        assertEquals(experienciaEsperada, elfo.getExperiencia());
        assertEquals(flechasEsperadas, elfo.getFlechas());
    }
    
    @Test
    public void elfoToStringPadrao() {
        // Arrange
        Elfo elfo = new Elfo("Faustão");
        String resultadoEsperado = "Faustão possui 42 flechas e 0 níveis de experiência.";
        // Act
        String resultadoObtido = elfo.toString();
        // Assert
        assertEquals(resultadoEsperado, resultadoObtido);
    }
    
<<<<<<< HEAD:crescer-2015-1-master/src/modulo-01-java-OO/Dia01/ElfoTest.java
       @Test
    public void quantosElfosForamCriadosExUmElfo() {
        // Arrange
        Elfo zerador = new Elfo("Faustão");
        zerador.zeraContadorElfos();
        Elfo elfo = new Elfo("Faustão");
        int resultadoEsperado = 1;
        // Act
        int resultadoObtido = elfo.getQuantosElfosForamCriados();
        // Assert
        assertEquals(resultadoEsperado, resultadoObtido);
    }
    
       @Test
    public void quantosElfosForamCriadosExdezElfos() {
        // Arrange
        Elfo.zeraContadorElfos();
        Elfo elfo1 = new Elfo("Faustão");
        Elfo elfo2 = new Elfo("Faustão");
        Elfo elfo3 = new Elfo("Faustão");
        Elfo elfo4 = new Elfo("Faustão");
        Elfo elfo5 = new Elfo("Faustão");
        Elfo elfo6 = new Elfo("Faustão");
        Elfo elfo7 = new Elfo("Faustão");
        Elfo elfo8 = new Elfo("Faustão");
        Elfo elfo9 = new Elfo("Faustão");
        Elfo elfo10 = new Elfo("Faustão");
        
        int resultadoEsperado = 10;
        // Act
        int resultadoObtido = elfo1.getQuantosElfosForamCriados();
        // Assert
        assertEquals(resultadoEsperado, resultadoObtido);
    }
=======
    @Test
    public void criarUmElfoIncrementaQtdElfos() {
        // Arrange
        int esperado = 1;
        // Act
        Elfo elfo = new Elfo("Faustão");
        // Assert
        assertEquals(esperado, Elfo.getQtdElfosCriados());
    }
    
    @Test
    public void criarDoisElfosIncrementaQtdElfos() {
        // Arrange
        int esperado = 2;
        // Act
        new Elfo("Faustão");
        new Elfo("Faustão II");
        // Assert
        assertEquals(esperado, Elfo.getQtdElfosCriados());
    }
    
    @Test
    public void criarTresElfosIncrementaQtdElfos() {
        // Arrange
        int esperado = 3;
        // Act
        new Elfo("Faustão");
        new Elfo("Faustão II");
        new Elfo("Faustão III");
        // Assert
        assertEquals(esperado, Elfo.getQtdElfosCriados());
    }
    
    @Before
    public void setUp() {
        Elfo.resetaQuantidadeDeElfos();
    }
    
    @Test
    public void doisElfosComMesmoNomeSaoIguais() {
        // Arrange
        boolean esperado = true;
        // Act
        Elfo legolas = new Elfo("Legolas");
        Elfo legolas2 = new Elfo("Legolas");
        // Assert
        assertEquals(esperado, legolas.equals(legolas2));
    }
    
    @Test
    public void doisElfosComNomesDiferentesNaoSaoIguais() {
        // Arrange
        boolean esperado = false;
        // Act
        Elfo legolas = new Elfo("Legolas");
        Elfo legolas2 = new Elfo("Legolas II");
        // Assert
        assertEquals(esperado, legolas.equals(legolas2));
    }
    
    
    
>>>>>>> abd8259af470045c4050ab5cb397cdaeeffb6389:src/modulo-01-java-OO/Dia01/ElfoTest.java
    
}



