package CreandoZoo;
import ZooExceptions.*;
import java.util.Scanner;
public class Main {
    
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Ingrese la cantidad de leones");
    int leones = scan.nextInt();

    System.out.println("Ingrese la cantidad de monos");
    int monos = scan.nextInt();

    System.out.println("Ingrese la cantidad de contadores");
    int contadores = scan.nextInt();

    System.out.println("Ingrese la cantidad de veterinarios");
    int veterinarios = scan.nextInt();

    try{

        Zoo miZoo = new Zoo(leones,monos,contadores,veterinarios);
        System.out.println(miZoo.toString());

    }catch(ExcesoDeLeonesException e){
        System.out.println(e.getMessage());
    }catch(ExcesoDeMonosException e1){
        System.out.println(e1.getMessage());
    }catch(ExcesoDeContadoresException e2){
        System.out.println(e2.getMessage());
    }catch(ExcesoDeVeterinariosException e3){
        System.out.println(e3.getMessage());
    }

    }

}
