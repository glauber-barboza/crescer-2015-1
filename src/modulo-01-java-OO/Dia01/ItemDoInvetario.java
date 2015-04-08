
/**
 * 
 * @author Glauber
 * classe que contem os itens dos personagens;
 */
public class ItemDoInvetario
{
    // instance variables - replace the example below with your own
    private String descricao;
    private int quantidade;

    /**
     * Constructor for objects of class itemDoInvetario
     */
    public ItemDoInvetario(String nomeItem, int quantidadeItem)
    {
         descricao=nomeItem;
        quantidade=quantidadeItem;
    }
    public String getDescricao(){
    
        return descricao;
    }
    
    public int getQuantidade(){
    
        return quantidade;
    }
}
