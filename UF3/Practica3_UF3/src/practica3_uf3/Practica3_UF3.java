/* 1. Crea un programa que llegeixi números enters per teclat i els vagi guardant en un
fitxer “numeros.dat”. El programa finalitzarà quan s’entri el número zero.
Cal que adjunteu a la resolució de la pràctica una captura de pantalla on es vegi
el contingut del fitxer en format hexadecimal.*/
package practica3_uf3;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Ramon
 */

public class Practica3_UF3 {
    
    public static void main(String[] args) {
        Scanner s  = new Scanner (System.in);
        int n = 1;
        CrearFile();
        while (n>0){
        System.out.println("Digues un numero"); 
        n = s.nextInt();
        LlegirNumeros(n);
        if (n == 0 ){
            System.out.println("El programa a finalitzat");
        }
        }
    }
    public static File CrearFile(){
        
        return null; 
    }
    public static int LlegirNumeros(int i){
        return 0;
    }
}
