
/**
 *Define o erro lanlçado quando um elfo não pode ser alistado
 */



public class NaoPodeAlistarException extends Exception
{
    public NaoPodeAlistarException(){
    super("Erro ao alistar um elfo. Porfavor tente novamente e se o erro persistir contate o administrador");
    }
   
}
