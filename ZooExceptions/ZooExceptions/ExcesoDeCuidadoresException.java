package ZooExceptions;

public class ExcesoDeCuidadoresException extends ExcesoDePersonalException {
    
    public ExcesoDeCuidadoresException(){
        super("Hay demasiados cuidadores de animales en el zoo");
    }
    public ExcesoDeCuidadoresException( String mensaje ){
        super(mensaje);
    }
}
