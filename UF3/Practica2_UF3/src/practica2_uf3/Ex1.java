/*Fes un programa que permeti gestionar el fitxer de clients amb les següents
operacions:
a) Alta d’un client (registrar un client que no existia abans al fitxer)
b) Consulta d’un client per posició
c) Consulta d’un client per codi
d) Modificar un client
e) Esborrar un client
f) Llistat de tots els clients*/
package practica2_uf3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Ramon
 */
public class Ex1 {

    public static void main(String[] args) throws IOException {
        CrearFile();
        OmplirFile();

    }

    public static File CrearFile() throws IOException {
        File arxiu = new File("./arxiu.txt");
        arxiu.createNewFile();
        return arxiu;
    }

    public static FileWriter OmplirFile() {
        FileWriter arxiu = null;
        PrintWriter pw = null;
        try {
            arxiu = new FileWriter("arxiu.txt");
            pw = new PrintWriter(arxiu);

            pw.println("|Posició | Inici | Longitud | Descripció   |");
            pw.println("|   1    |   1   |    6     |Codi          |");
            pw.println("|   2    |   7   |   20     |Nom           |");
            pw.println("|   3    |  27   |   30     |Cognoms       |");
            pw.println("|   4    |  57   |    8     |Data naix.    |");
            pw.println("|   5    |  65   |   40     |Adreça postal |");
            pw.println("|   6    | 105   |   30     |E-mail        |");

        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            // Nuevamente aprovechamos el finally para
            // asegurarnos que se cierra el fichero.
            if (null != arxiu) {
                arxiu.close();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return arxiu;
    }
    public static FileWriter Client(FileWriter arxiu) throws IOException{
        arxiu = new FileWriter("arxiu.txt");
        PrintWriter pw = new PrintWriter(arxiu);
        
        return arxiu;
    }
}
