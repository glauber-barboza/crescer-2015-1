
/**
 * Write a description of class ElfoNoturno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ElfoNoturno extends Elfo
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class ElfoNoturno
     */
    public ElfoNoturno(String nome)
    {
        // initialise instance variables
        super(nome);
    }

      /**
     * elfos noturnos ao atirar flechas
     * ganham o triplo de experiencia, mas perdem 5% de sua vida atual;
     *
     */
    protected void elfoNorutnoAtaca(Orc orc){
        super.atirarFlecha(orc);
        this.experiencia += 2;
        double qtdVidaAPerder = this.vida * 0.05;
        //double qtdVidaAPerder = this.vida * 5/100;
        this.vida -= qtdVidaAPerder;
        this.status = (int)this.vida == 0 ? Status.MORTO : this.status;
    }
}
