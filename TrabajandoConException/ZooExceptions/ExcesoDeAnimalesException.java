package ZooExceptions;

public class ExcesoDeAnimalesException extends DemasiadosElementosException{
    
    public ExcesoDeAnimalesException(){
        super("Hay demasiados animales en el zoo");
    }
    public ExcesoDeAnimalesException(String mensaje){
        super(mensaje);
    }
}
