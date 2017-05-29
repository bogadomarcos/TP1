package ejercicio4;
import java.util.Scanner;
public class tabla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=5;
        System.out.println("Tabla del " + n);
        for(int i = 1; i<=10; i++){
             System.out.println(n + " * " + i + " = " + n*i);
        }
    }
}
