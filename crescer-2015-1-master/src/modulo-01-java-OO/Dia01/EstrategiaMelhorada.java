import java.util.*;
/**
 * Write a description of class EstrategiaMelhorada here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EstrategiaMelhorada
{
     public void atacarOrcs(ArrayList<Elfo> elfos, ArrayList<Orc> orcs) {
        System.out.println("Estratégia normalzinha...");
        ElfoNoturno elfoNoturno=new ElfoNoturno("Tio Patinhas");
        
        int quantidadeDeAtaques= elfos.size() * orcs.size();
        int limiteElfosNoturnos= (int)(quantidadeDeAtaques * 0.3);
        int quantidadeNoturnosQueJaAtacaram=0;
        boolean elfoNoturnoQueVaiAtaca;
        for (Elfo elfoQueVaiatacar : elfos) {
            elfoNoturnoQueVaiAtaca= elfoQueVaiatacar instanceof ElfoNoturno;
            if(elfoNoturnoQueVaiAtaca){
                if(quantidadeNoturnosQueJaAtacaram >= limiteElfosNoturnos){
                 for (Orc orc : orcs) {
                elfoQueVaiatacar.atirarFlecha(orc);
                }
                }
            }
             for (Orc orc : orcs) {
                elfoQueVaiatacar.atirarFlecha(orc);
            }
        }        
        
    }
}
