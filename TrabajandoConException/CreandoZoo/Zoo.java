package CreandoZoo;
import ZooExceptions.*;
public class Zoo {

    private int cantidadDeLeones;
    private int cantidadDeMonos;
    private int cantidadDeContadores;
    private int cantidadDeVeterinarios;

    public Zoo () {
    cantidadDeLeones = 5;
    cantidadDeMonos = 8;
    cantidadDeContadores = 2;
    cantidadDeVeterinarios = 2;
    }
    public Zoo (int cantidadDeLeones,int cantidadDeMonos,int cantidadDeContadores,int cantidadDeVeterinarios) throws ExcesoDeContadoresException,ExcesoDeVeterinariosException, ExcesoDeLeonesException, ExcesoDeMonosException{
          
        if(cantidadDeLeones>5){
            throw new ExcesoDeLeonesException();
        }else{
            this.cantidadDeLeones=cantidadDeLeones;
        }
        if(cantidadDeMonos>8){
            throw new ExcesoDeMonosException();
        }else{
            this.cantidadDeMonos=cantidadDeMonos;
        }
        if(cantidadDeContadores>2){
            throw new ExcesoDeContadoresException();
        }else{
            this.cantidadDeContadores=cantidadDeContadores;
        }
        if(cantidadDeVeterinarios>3){
            throw new ExcesoDeVeterinariosException();
        }else{
            this.cantidadDeVeterinarios=cantidadDeVeterinarios;
        }
        
    }
    public String toString(){
        return "Se ha inaugurado un Zoológico con "+cantidadDeLeones+" leones, "+cantidadDeMonos+" monos, "+cantidadDeContadores+" contadores y "+cantidadDeVeterinarios+" cuidadores";
    }

} 