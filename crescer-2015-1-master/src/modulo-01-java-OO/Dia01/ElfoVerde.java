import java.util.*;
/**
 * Write a description of class ElfoVerde here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ElfoVerde extends Elfo 
{
    private final ArrayList<String> itensPermitidos=new ArrayList<String>(); 
    {
        
        itensPermitidos.add("Espada de aço valiriano");
        
        itensPermitidos.add("Arco e Flecha de vidro");
    }
    
    public ElfoVerde(String nome) {
        super(nome);
    }
    
    /**
     * Atira a flecha "à moda verde".
     * Por ser um elfo verde, ganhará o dobro de experiência que um Elfo comum.
     * 
     * @param orc Orc que receberá a flechada.
     */
    public void atirarFlecha(Orc orc) {
        super.atirarFlecha(orc);
        this.experiencia++;
    }
    
    /**
     * Adiciona o item no inventário, desde que o mesmo tenha descrição válida.
     * Atuais descrições válidas: "Espada de aço valiriano", "Arco e Flecha de vidro"
     * 
     * @param item ItemDoInventario a ser adicionado
     */
    public void adicionarItem(ItemDoInventario item) {
        
        boolean descricaoValida = item != null && itensPermitidos.contains(item.getDescricao());

        if (descricaoValida) {
            super.adicionarItem(item);
        }
       
    }
    
     
        public void elfoNorutnoAtaca(Orc orc) {
        
        super.elfoNorutnoAtaca(orc);

    }
}
