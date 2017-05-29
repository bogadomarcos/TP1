package ejercicio5;
import java.util.Scanner;
public class empleado {
    private Scanner teclado;
    private String nombre;
    private int sueldo;
    public void inicializar() {
        teclado=new Scanner(System.in);
        System.out.print("Ingrese nombre:");
        nombre=teclado.next();
        System.out.print("Ingrese su sueldo:");
        sueldo=teclado.nextInt();
    }
    public void imprimir() {
        System.out.println("Nombre:"+nombre);
        System.out.println("Sueldo:"+sueldo);
    }
    public void operacion() {
        if (sueldo>3000) {
            System.out.print("Su sueldo" + "supera el minimo." + "Debera pagar impuestos");
        } else {
            System.out.print("No debera pagar impuestos");
        }
    }
    public static void main(String[] ar) {
        empleado empleado1;
        empleado1=new empleado();
        empleado1.inicializar();
        empleado1.imprimir();
        empleado1.operacion();
    }
}