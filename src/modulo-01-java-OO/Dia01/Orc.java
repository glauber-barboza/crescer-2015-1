
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

    /**
     * Constructor for objects of class Orcs
     */
    public Orc()
    {
        // initialise instance variables
        nome = "Bazinga";
        hp = 110;
    }
   //orc recebe 10 de dano
    public int recebeDano(){
     hp = hp-10;   
     return hp;
    }
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
}