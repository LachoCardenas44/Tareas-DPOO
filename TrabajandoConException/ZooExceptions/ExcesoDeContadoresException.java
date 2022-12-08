package ZooExceptions;

public class ExcesoDeContadoresException extends ExcesoDePersonalException{
    
    public ExcesoDeContadoresException(){
        super("Hay demasiados contadores en el zoo");

    }
    public ExcesoDeContadoresException(String mensaje){
        super(mensaje);
    }
}
