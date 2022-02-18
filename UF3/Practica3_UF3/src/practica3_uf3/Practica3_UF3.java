/* 1. Crea un programa que llegeixi números enters per teclat i els vagi guardant en un
fitxer “numeros.dat”. El programa finalitzarà quan s’entri el número zero.
Cal que adjunteu a la resolució de la pràctica una captura de pantalla on es vegi
el contingut del fitxer en format hexadecimal.*/
package practica3_uf3;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Ramon
 */
public class Practica3_UF3 {

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int n = 1;
        CrearFile();
        while (n > 0) {
            System.out.println("Digues un numero");
            n = s.nextInt();
            LlegirNumeros(n);
            if (n == 0) {
                System.out.println("El programa a finalitzat");
            }
        }
    }

    public static File CrearFile() {
       
        return null;
    }

    public static FileWriter LlegirNumeros(int i) throws IOException { 
        File numeros = new File ();
        FileOutputStream fos = new FileOutputStream (numero);
        DataOutputStream dos = new DataOutputStream (fos);
        long num1 ;
        os.write(i);
        os.flush();
        os.close();
}
}
