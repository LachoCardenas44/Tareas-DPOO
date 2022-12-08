package ZooExceptions;

public class ExcesoDePersonalException extends DemasiadosElementosException {
    
    public ExcesoDePersonalException(){
        super("Hay demasiados empleados en el zoo");
    }
    public ExcesoDePersonalException(String mensaje){
        super(mensaje);
    }
}
