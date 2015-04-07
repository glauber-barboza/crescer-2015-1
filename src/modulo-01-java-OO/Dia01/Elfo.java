
/**
 * Define objetos Elfo
 * 
 * @author CWI Software
 */
public class Elfo
{
    //ALTERAÇÃO EFETUADA
    
    
    private String nome;
    private int flechas, experiencia;

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
        this.nome = "Legolas";
    }

    
   /**
     * Atira uma flecha e perde uma unidade.
     * 
     * @param umOrc Orc que receberá uma flechada.
     */
    public void atirarFlechaOrc(Orc orc){
        if(flechas >=0){
        orc.recebeDano();
        experiencia++;
        flechas--;
     }
}
public void setFlechas(int novaQtdFlechas) {
        if (novaQtdFlechas > flechas) {
            flechas = novaQtdFlechas;
        }
    }
    
  //Testes
public int getFlechas(){
        
           return flechas;
       
}
public String retornaNome(){
        
           return nome;
       
    }
  public int getExperiencia(){
        
           return experiencia;
       
}  

public String toString(){
    StringBuilder builder=new StringBuilder();
    builder.append(
       String.format("%s possui %d %s e %d %s de experiência.",
       this.nome,
       this.flechas,
       this.flechas == 1 ? "flecha" : "flechas",
       this.experiencia,
       this.flechas == 1 ? "níveil" : "níveis"  //metodo chamado de ternário??
       ));//melhor prática a ser utilizada 
    
    
    /*
    StringBuilder builder=new StringBuilder();
    builder.append(this.nome);
    builder.append(" Possui ");
    builder.append(this.flechas);
    builder.append(" ");
    builder.append(textoFlechas);
    builder.append(" e ");
    builder.append(this.experiencia);
    builder.append(" ");
    builder.append(textoExperiencia);
    builder.append(" de experiência");
    
    //return builder.toString();
    //metodo com boa pratica
   
    */
    return builder.toString();
  
    
    //return this.nome+" Possui "+this.flechas+" "+ textoFlechas+" e "+this.experiencia+" "+textoExperiencia+" de experiência";//metodo que funciona
    
    
    
}
}
