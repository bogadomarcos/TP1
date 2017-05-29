package ejercicio3;
import java.util.Scanner;
public class entero {
    private Scanner teclado;
    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private int num5;
    private int num6;
    private int num7;
    private int num8;
    private int num9;
    private int num10;
    private int pares=0;
    private int impares=0;
    public void inicializar() {
        teclado=new Scanner(System.in);
        System.out.print("Numero 1 : ");
        num1=teclado.nextInt();
        System.out.print("Numero 2 : ");
        num2=teclado.nextInt();
        System.out.print("Numero 3 : ");
        num3=teclado.nextInt();
        System.out.print("Numero 4 : ");
        num4=teclado.nextInt();
        System.out.print("Numero 5 : ");
        num5=teclado.nextInt();
        System.out.print("Numero 6 : ");
        num6=teclado.nextInt();
        System.out.print("Numero 7 : ");
        num7=teclado.nextInt();
        System.out.print("Numero 8 : ");
        num8=teclado.nextInt();
        System.out.print("Numero 9 : ");
        num9=teclado.nextInt();
        System.out.print("Numero 10 : ");
        num10=teclado.nextInt();
        	
    }
  
    public void operar(){
       if (num1%2==0){
    	   pares=pares+1;
       }else{
    	   impares=impares+1;
    	  
       }
       if (num2%2==0){
    	   pares=pares+1;
    	   
       }else{
    	   impares=impares+1;
    	   
       }
       if (num3%2==0){
    	   pares=pares+1;
    	   
       }else{
    	   impares=impares+1;
    	   
       }
       if (num4%2==0){
    	   pares=pares+1;
    	   
       }else{
    	   impares=impares+1;
    	   
       }
       if (num5%2==0){
    	   pares=pares+1;
    	   
       }else{
    	   impares=impares+1;
    	   
       }
       if (num6%2==0){
    	   pares=pares+1;
    	   
       }else{
    	   impares=impares+1;
    	   
       }
       if (num7%2==0){
    	   pares=pares+1;
    	   
       }else{
    	   impares=impares+1;
    	   
       }
       if (num8%2==0){
    	   pares=pares+1;
    	   
       }else{
    	   impares=impares+1;
    	   
       }
       if (num9%2==0){
    	   pares=pares+1;
    	   
       }else{
    	   impares=impares+1;
    	  	
       }
       if (num10%2==0){
    	   pares=pares+1;
    	   System.out.print(" La cantidad de pares es :"+pares);
       }else{
    	   impares=impares+1;
    	   System.out.print("La cantidad de impares es: "+impares);
       }
    } 
       public static void main(String[] ar) {
            entero entero1;
            entero1=new entero();
            entero1.inicializar();
            entero1.operar();
        }
        }
        