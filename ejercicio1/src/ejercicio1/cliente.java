package ejercicio1;
import java.util.Scanner;
public class cliente {
    private Scanner teclado;
    private int articulo;
    private int cantidad;
    private int resultado;
    public void inicializar() {
        teclado=new Scanner(System.in);
        System.out.print("Ingrese el valor del articulo : ");
        articulo=teclado.nextInt();
        System.out.print("Ingrese la cantidad que lleva del articulo : ");
        cantidad=teclado.nextInt();
       
       
    }
  
    public void imprimir() {
        System.out.println("Precio Articulo:"+articulo);
        System.out.println("Cantidad:"+cantidad);
        System.out.println("Resultado :"+resultado);
        
    }
    public void operar(){
        resultado=articulo*cantidad;
    } 
        public static void main(String[] ar) {
            cliente cliente1;
            cliente1=new cliente();
            cliente1.inicializar();
            cliente1.operar();
            cliente1.imprimir();
        }
   
    }
