package ZooExceptions;

public class ExcesoDeVeterinariosException extends ExcesoDePersonalException {
    
    public ExcesoDeVeterinariosException(){
        super("Hay demasiados veterinarios en el zoo");
    }
    public ExcesoDeVeterinariosException( String mensaje ){
        super(mensaje);
    }
}
