import java.util.*;

/**
 * Write a description of class exercitoDeElfos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class exercitoDeElfos
{
    // instance variables - replace the example below with your own
    private int x;
    private HashMap<String, Object> agrupamento =new HashMap<>();  
    private HashMap<Status, ArrayList<Elfo>> porStatus =new HashMap<>();  
    /**
     * Constructor for objects of class exercitoDeElfos
     */
    public exercitoDeElfos()
    {
        // initialise instance variables
        x = 0;
    }
    
    public void alistarUmElfo(Elfo elfo){
      
        boolean TipoCertoElfo = elfo instanceof ElfoNoturno;
        if(TipoCertoElfo){
        
         agrupamento.put(elfo.getNome(), elfo);   
        }
      
    }
    public HashMap<String, Object> getExercito(){
           
        return agrupamento;
        }
        
     }
