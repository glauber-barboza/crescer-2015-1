
/**
 * Write a description of class Orcs here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Orcs
{
    // instance variables - replace the example below with your own
    
    private String nome;
    private int hp;

    /**
     * Constructor for objects of class Orcs
     */
    public Orcs()
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
    
}