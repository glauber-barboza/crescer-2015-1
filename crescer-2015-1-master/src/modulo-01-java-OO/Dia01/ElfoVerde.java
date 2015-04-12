
/**
 * Write a description of class ElfoVerde here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ElfoVerde extends Elfo 
{
    

    // type initializer
    {
      //  flechas = 42;
    }
    
    /**
     * Cria objetos Elfo
     * 
     * @param umNome Nome que o elfo receberá
     * @param flechas Quantidade inicial de flechas
     */
    public ElfoVerde(String umNome, int flechas)
    {
        super(umNome,flechas);
        // this.nome = nome;
    }
    
    /**
     * Cria um elfo informando nome.
     * 
     * @param nome Nome a ser dado para o Elfo.
     */
    public ElfoVerde(String umNome){
        this(umNome,0);

    }
    
    /**
     * Atira uma flecha e perde uma unidade.
     * 
     * @param umOrc Orc que receberá uma flechada.
     */
    public void atirarFlecha(Orc umOrc) {
        //flechas = flechas - 1;
        flechas--;
        experiencia++;
        experiencia++;
        umOrc.recebeAtaque();
    }
    
    /**
     *
     *Elfos só podem ter dois tipos de
     *itens: "Espada de aço valiriano" ou
     *“Arco e Flecha de vidro".
     */
    public void elfoVerdeRecebeItem(ItemDoInventario item) {
        //flechas = flechas - 1;
        ItemDoInventario espada = new ItemDoInventario(1, "Espada de aço Valiriano");
        ItemDoInventario arcoEflecha = new ItemDoInventario(1, "Arco e Flecha de vidro");
                 
        if(item == espada || item == arcoEflecha){
        super.adicionarItem(item);
    }
    
    }
    
}