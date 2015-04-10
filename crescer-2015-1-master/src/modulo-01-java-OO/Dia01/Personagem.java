import java.util.*;
/**
 * Write a description of class Personagem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Personagem
{
    // instance variables - replace the example below with your own
  
    protected Status status =Status.VIVO;
    protected int vida=0,experiencia=0;
    protected String nome;
    protected ArrayList<ItemDoInventario> itens = new ArrayList<ItemDoInventario>();
    
    protected Personagem(int vida, String nome){
        this.vida=vida;
        this.nome=nome;
    }
    
    protected Status getStatus(){
        return status;
    }
   
    protected int getVida(){
    return vida;
    }
    
    protected String getNome() {
        return this.nome;
    }
    
    protected int getExperiencia() {
        return this.experiencia;
    }
    
    protected ArrayList<ItemDoInventario> getItens() {
        return this.itens;
    }
    
    /**
     * Adiciona um item ao inventário.
     * 
     * @param item Item a ser adicionado.
     */
    protected void adicionarItem(ItemDoInventario item) {
        this.itens.add(item);
    }

    /**
     * Remove o item do inventário do orc.
     * 
     * @param item Item a ser perdido do inventário.
     */
    protected void perderItem(ItemDoInventario item) {
        this.itens.remove(item);
    }
    
    /**
     * Concatena as descrições dos itens, separados por vírgula.
     * 
     * SEM ESPAÇO ENTRE AS VÍRGULAS E SEM PONTO FINAL
     * 
     * @return Descrições. Ex:
     * 
     * "Adaga,Escudo,Bracelete”
     */
    public String getDescricoesItens() {
        StringBuilder builder = new StringBuilder();
        
        /*
         * Utilizando for tradicional         
        int numeroDeItens = this.itens.size();

        for (int i = 0; i < numeroDeItens; i++) {
            ItemDoInventario itemAtual = this.itens.get(i);
            
            boolean éÚltimoÍndice = i == numeroDeItens - 1;
                        
            builder.append(
                éÚltimoÍndice ?
                itemAtual.getDescricao() :
                itemAtual.getDescricao() + ","
            );
        }
        */
       
       // C#
       //foreach (ItemDoInventario item in this.itens) { }
       
       /*
        * Utilizando FOREACH!!
       for (ItemDoInventario itemAtual : this.itens) {
           int i = this.itens.indexOf(itemAtual);
           int numeroDeItens = this.itens.size();
           boolean éÚltimoÍndice = i == numeroDeItens - 1;
           
           builder.append(
                éÚltimoÍndice ?
                itemAtual.getDescricao() :
                itemAtual.getDescricao() + ","
            );
       }
       */
      
      /*
       * JavaScript
      for (var i = 0, numeroDeItens = this.itens.size(); i < numeroDeItens; i++) {
      }
      */
      
     /*
      * WHILE (ENQUANTO)
      int i = 0;
      int numeroDeItens = this.itens.size();    

      while (i < numeroDeItens) {
          ItemDoInventario itemAtual = this.itens.get(i);
          boolean éÚltimoÍndice = i == numeroDeItens - 1;
           
          builder.append(
                éÚltimoÍndice ?
                itemAtual.getDescricao() :
                itemAtual.getDescricao() + ","
          );
          //
          i++;
      }
      */
     
     int i = 0;
     int numeroDeItens = this.itens.size();
     do {
         if (numeroDeItens > 0) {
             ItemDoInventario itemAtual = this.itens.get(i);
              boolean éÚltimoÍndice = i == numeroDeItens - 1;
               
              builder.append(
                    éÚltimoÍndice ?
                    itemAtual.getDescricao() :
                    itemAtual.getDescricao() + ","
              );
         }
         i++;
     } while(i < numeroDeItens);
     
       return builder.toString();
    }
    
     /**
     * Ordena itens do inventário por quantidade ascendente.
     * 
     * Algoritmo atual: Bubblesort
     */
    public void ordenarItens() {
        
        /*for (int i = 0; i < this.itens.size(); i++) {
            for (int j = 0; j < this.itens.size() - 1; j++) {
                ItemDoInventario itemAtual = this.itens.get(j);
                ItemDoInventario proximo = this.itens.get(j + 1);
                
                boolean precisaTrocar = 
                    itemAtual.getQuantidade() > proximo.getQuantidade();
                
                if (precisaTrocar) {
                    this.itens.set(j, proximo);
                    this.itens.set(j + 1, itemAtual);
                }
            }
        }*/
        
        Collections.sort(this.itens, new Comparator<ItemDoInventario>() {
            public int compare(ItemDoInventario item, ItemDoInventario outroItem) {
                return Integer.compare(item.getQuantidade(), outroItem.getQuantidade());
            }
        });
        
        
        // C#:
        // return this.itens.OrderBy(x => x.getQuantidade());
        
        // Ruby:
        // this.itens.sort_by { |x| x.get_quantidade }
        
    }
    
    public ItemDoInventario getItemComMaiorQuantidade() {
        
        ItemDoInventario itemMaiorQuantidade = null;
        
        boolean temItens = !this.itens.isEmpty();       
        if (temItens) {
            itemMaiorQuantidade = this.itens.get(0);
            
            for (int i = 1; i < this.itens.size(); i++) {
                ItemDoInventario itemAtual = this.itens.get(i);
                boolean encontreiAMaiorQuantidade =
                    itemAtual.getQuantidade() > itemMaiorQuantidade.getQuantidade();
                
                if (encontreiAMaiorQuantidade) {
                    // atualizar a minha referência para o maior parcial
                    itemMaiorQuantidade = itemAtual;
                }
            }
        }
        
        return itemMaiorQuantidade;
        
        // C#
        // return this.itens.Max(x => x.getQuantidade());
    }
        

}
