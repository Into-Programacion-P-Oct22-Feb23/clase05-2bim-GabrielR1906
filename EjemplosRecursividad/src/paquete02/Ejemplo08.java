/*
 * Factorial sin recursividad
 * 5! = 5 * 4 * 3 * 2 * 1
 */
package paquete02;

import java.util.Scanner;

public class Ejemplo08 {
    
// Renato Gabriel Rojas Silva
    
    public static void main(String[] args) {
        // Ingresar por teclado el tamaño de un arreglo
        // Ingresar por teclado los valores enteros del arreglo
        // Sumar los valores del arreglo, mediante la función misterio
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del arreglo:");
        int tamanio = entrada.nextInt();
        int[] arreglo = new int[tamanio];
        int contador = 1;
        for (int i = 0; i < arreglo.length; i++) {
            System.out.printf("Ingrese el valor numero %d del arreglo\n",
                    contador);
            arreglo[i] = entrada.nextInt();
            contador = contador + 1;
        }
        System.out.printf("La suma de los valores ingresados es igual"
                + " a %d\n", misterio(arreglo, tamanio));    
    }

    public static int misterio(int[] arreglo, int tamanio) {

        if (tamanio == 1) {
            return arreglo[0];
        } else {
            return arreglo[tamanio - 1] + misterio(arreglo, tamanio - 1);
        }
    }

}
