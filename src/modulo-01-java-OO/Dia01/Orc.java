import java.util.ArrayList;
/**
 * Write a description of class Orcs here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Orc
{
    // instance variables - replace the example below with your own
    
    private String nome;
    private int hp;
    private int xp;
    private Status status;
    private ItemDoInvetario item;
    ArrayList<Object> itemDoInventario=new ArrayList<Object>();

    /**
     * Constructor for objects of class Orcs
     */
    public Orc(String nomeInformado)
    {
        // initialise instance variables
        this.nome = nomeInformado;
        int cont=nome.length();
        hp = 110;
        status = Status.Vivo;
        
        
      
    }
  
    /**
     * De acordo com os parametros do gerarNumero ele recebera um dano
     */
    public void recebeDano(){
    
        double numeroRecebido= gerarNumero();
        if(numeroRecebido < 0 ){
            this.xp +=2;
            return;
        }else if(numeroRecebido>=0 && numeroRecebido<=110){
        
        }else{
            hp -= 10;
        }
        
    }
    
    /**
     * Metodo utilizado para retornar a vida atual do orc
     */
    public int getVida(){
        return hp;
    }
    
    
    /**
     * Imprime a vida atual da vida orc 
     * Ex:"Vida atual:110"
     */
    public String toString(){
        
        return "Vida atual: "+ this.hp;
    
    }
    
    
    /**
     * Exercicio loco do professor
     */
    private double gerarNumero(){
        double numero=0.0;
        boolean possuiNimeComMaisDe5Caracteres= this.nome != null && this.nome.length() > 5;
        boolean possuiVidaEntre30e60= this.hp>=30 && this.hp <=60;
        boolean estaFugindo= this.status == status.Fugindo;
        boolean estaCaçandoOuDormindo= this.status == status.Fugindo || this.status == status.Dormindo;
        boolean experienciaEPar= this.xp % 2 ==0;
        
        if(possuiNimeComMaisDe5Caracteres){  
        numero += 65;//numero recebe o valor dele mesmomo mais 65
        }else{
         numero -= 65;
        }
        
        
         if(possuiVidaEntre30e60){  
        numero *= 2;
        }
        if(this.hp < 20){
         numero *= 3;
        }
        if(estaFugindo){
        numero /= 2;
        }else if(estaCaçandoOuDormindo){
            numero += 1;
        }
        if(experienciaEPar){
            numero = Math.pow(numero, 2);  
        }
        if(experienciaEPar== false && xp>2){
            numero = Math.pow(numero, 3);
        }
        return numero;
    }
    
    /**
     * Metodo utilizado para adicionar um status ao orc
     * ex:Vivo,Morto,Dormindo
     */
       public void setStatus(Status statusRecebido){
           
        this.status=statusRecebido;
        
    }
    
     public String getNome(){
        return nome;
    }
    
    /**
     * Metodo utilizado para retornar a experiencia atual do orc
     */
     public int getExperiencia(){
        return xp;
    }
    
    /**
     * Metodo utilizado para adicionar 1 de experiencia ao orc
     */
    public void set1Xp(){
    xp+=1;
    }
    
    public void adicionarItem(ItemDoInvetario itemInvetario ){
        
    itemDoInventario.add(itemInvetario);
    
    }
     public void perderItem(ItemDoInvetario itemInvetario ){
        
    itemDoInventario.remove(itemInvetario);
    
    }
    
    public Object getItemForIncice(int indiceItem ){
        
    return itemDoInventario.get(indiceItem);
    
    } 
    
    
    
    
}