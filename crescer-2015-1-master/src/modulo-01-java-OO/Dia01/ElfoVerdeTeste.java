

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;


/**
 * The test class ElfoVerdeTeste.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ElfoVerdeTeste
{
    /**
     * Default constructor for test class ElfoVerdeTeste
     */
    public ElfoVerdeTeste()
    {
    }

   @Test
    public void elfoRecebeEspada() {
        
        ElfoVerde elfo = new ElfoVerde("ElfoMauluco");   
         ArrayList<ItemDoInventario> inventarioEsperado = new ArrayList<>();
        ItemDoInventario espada = new ItemDoInventario(1, "Espada de aço Valiriano");
        
        elfo.adicionarItem(espada);
        inventarioEsperado.add(espada);
        
        assertEquals(inventarioEsperado, elfo.getItens());
    }
    
    
   @Test
    public void elfoRecebeArcoEflecha() {
        
        ElfoVerde elfo = new ElfoVerde("ElfoMauluco");   
         ArrayList<ItemDoInventario> inventarioEsperado = new ArrayList<>();
        ItemDoInventario arcoEflecha = new ItemDoInventario(1, "Arco e Flecha de vidro");
        
        elfo.adicionarItem(arcoEflecha);
        inventarioEsperado.add(arcoEflecha);
        
        assertEquals(inventarioEsperado, elfo.getItens());
    }
    
    @Test
    public void elfoRecebeItemQueNaoDeveTer() {
        
        ElfoVerde elfo = new ElfoVerde("ElfoMauluco");   
         ArrayList<ItemDoInventario> inventarioEsperado = new ArrayList<>();
        ItemDoInventario balde = new ItemDoInventario(1, "Balde de madeira");
        
        elfo.adicionarItem(balde);
        inventarioEsperado=null;
        assertEquals(inventarioEsperado, elfo.getItens());
    }
}
