/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entornos;
import java.util.Scanner;
/**
 *
 * @author clagui
 */
public class Entornos {
    public static void main(String[] args) {
            
        //Declaramos las variables
        int n;
        double media;
        int suma = 0;
        
        Scanner reader = new Scanner(System.in);
        
        //Pedimos el valor de la varible n, y la leemos
        System.out.println("Introduce un número entero: ");
        n = reader.nextInt();
        
        //Durante esta condición se cumpla se hará lo siguiente
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
            suma = suma + i;
            System.out.println(suma);
        } 
        //Si n es 0 o negativo dará error
        if ((n==0) || (n<0)) {
            System.err.println("ERROR. Por favor, introduce otro numero: ");
        }
        
        //Se calcula la media y se muestra por pantalla
        media = suma/n;
        System.out.println("La media es: " + media);
    }
}

