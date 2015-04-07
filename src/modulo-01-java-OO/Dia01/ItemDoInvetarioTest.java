

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class itemDoInvetarioTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ItemDoInvetarioTest
{
    /**
     * Default constructor for test class itemDoInvetarioTest
     */
    public ItemDoInvetarioTest()
    {
    }

      @Test
    public void recebeItens(){
        
        ItemDoInvetario item=new ItemDoInvetario();
        item.recebeItem("Arco", 1);
        String itemEsperado= "Arco";
        int quantidadeEsperada=1;
        
       assertEquals(itemEsperado, item.getDescricao());
       assertEquals(quantidadeEsperada, item.getQuantidade());

    }
    
    
}
