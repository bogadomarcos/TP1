package ejercicio2;
import java.util.Scanner;
public class numeros {
    private Scanner teclado;
    private int num1;
    public void inicializar() {
        teclado=new Scanner(System.in);
        System.out.print("ingrese un numero : ");
        num1=teclado.nextInt();
     
    }
  
    public void operar(){
        if (num1>=100) {
            System.out.print(num1+" tiene 3 digitos. ");}
         else if (num1>=10){
            System.out.print(num1+" tiene 2 digitos. ");
        }else{
        	System.out.print(num1+" tiene 1 digito. ");
    }
    } 
        public static void main(String[] ar) {
            numeros numeros1;
            numeros1=new numeros();
            numeros1.inicializar();
            numeros1.operar();
           
        }
   
    }