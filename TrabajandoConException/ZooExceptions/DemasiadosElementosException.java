package ZooExceptions;

public class DemasiadosElementosException extends Exception{

    public DemasiadosElementosException(){
        super("Hay demasiados elementos en el zoo");
    }
    public DemasiadosElementosException(String mensaje){
        super(mensaje);
    }
    

}