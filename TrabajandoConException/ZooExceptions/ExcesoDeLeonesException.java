package ZooExceptions;

public class ExcesoDeLeonesException extends ExcesoDeAnimalesException {
    
    public ExcesoDeLeonesException(){
        super("Se ha excedido el numero de leones permitidos en el zoo");
    }
    public ExcesoDeLeonesException(String mensaje){
        super(mensaje);
    }
}
