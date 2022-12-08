package ZooExceptions;

public class ExcesoDeMonosException extends ExcesoDeAnimalesException {
    
    public ExcesoDeMonosException(){
        super("Hay demasiados monos en el zoo");
    }
    public ExcesoDeMonosException(String mensaje){
        super(mensaje);
    }
}
