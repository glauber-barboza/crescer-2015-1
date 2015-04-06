
/**
 * Define objetos Elfo
 * 
 * @author CWI Software
 */
public class Elfo
{
    // YYY
    //PPPPP
    //ALTERAÇÃO EFETUADA
    
    
    private String nome;
    private int flechas, experiencia;
    private int hpOrc;

    // type initializer
    {
        flechas = 42;
    }
    
    /**
     * Cria objetos Elfo
     * 
     * @param umNome Nome que o elfo receberá
     * @param flechas Quantidade inicial de flechas
     */
    public Elfo(int flechas)
    {
        
        this.nome = "Legolas";
        this.flechas = flechas;
    }
    
    public Elfo() {
        this.nome = "LEGOLAS";
    }
    
    /**
     * Atira uma flecha e perde uma unidade.
     */
    public void atirarFlecha() {
        //flechas = flechas - 1;
        flechas--;
        experiencia++;
    }
    
    //metodo que atira flechas no orc
    public void atirarFlechaOrc(Orcs orc){
        
        hpOrc= orc.recebeDano();
        flechas--;
       
        if(hpOrc<=0){
            experiencia=experiencia+10;
        }
    }
    
    //Testes
   
       public int quantidadeFlechas(){
        
           return flechas;
       
    }
    
     public String retornaNome(){
        
           return nome;
       
    }
    
    
}
