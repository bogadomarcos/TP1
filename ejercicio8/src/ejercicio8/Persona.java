package ejercicio8;
import java.util.Scanner;
public class Persona {
private Scanner teclado;
private String nombre;
private String apellido;
private int sueldo;
public void inicializacion() {
teclado=new Scanner(System.in);
System.out.print("Ingrese su nombre:");
nombre=teclado.next();
System.out.print("Ingrese su apellido:");
apellido=teclado.next();

}
public void imprimir() {
System.out.print("Nombre : "+nombre);
System.out.print("  Apellido  : " +apellido );
}
public class Empleado extends Persona {
	public void inicializar2() {
		teclado=new Scanner(System.in);
		System.out.println( "Ingrese su sueldo : ");
		sueldo=teclado.nextInt();
		}
	public void imprimir2() {
		System.out.print("Sueldo : "+sueldo);
}
}	public static void main(String[] ar){
    Persona Persona1=new Persona();
    Persona1.inicializacion();
    Persona1.imprimir();
    Empleado Empleado1;
    Empleado1=new Persona() . new Empleado();
    Empleado1.inicializar2();
    Empleado1.imprimir2();
}
}


