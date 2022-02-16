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
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Ramon
 */
public class Ex1 {

    public static void main(String[] args) throws IOException {
        CrearFile();
        OmplirFile();
        Nom();
        Cognom();
        Data_naix();
        Lector();
        
    }

    public static File CrearFile() throws IOException {
        File arxiu = new File("./arxiu.txt");
        arxiu.createNewFile();
        return arxiu;
    }

    public static FileWriter OmplirFile() {
        FileWriter write = null;
        PrintWriter pw = null;
        try {
            write = new FileWriter("arxiu.txt");
            pw = new PrintWriter(write);

            pw.println("|Posició | Inici | Longitud | Descripció   |");
            pw.println("|   1    |   1   |    6     |Codi          |");
            pw.println("|                                          |");
            pw.println("|   2    |   7   |   20     |Nom           |");
            pw.println("|                                          |");
            pw.println("|   3    |  27   |   30     |Cognoms       |");
            pw.println("|                                          |");
            pw.println("|   4    |  57   |    8     |Data naix.    |");
            pw.println("|                                          |");
            pw.println("|   5    |  65   |   40     |Adreça postal |");
            pw.println("|                                          |");
            pw.println("|   6    | 105   |   30     |E-mail        |");
            pw.println("|                                          |");

        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if (null != write) {
                write.close();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return write;
    }

    public static FileWriter Client(FileWriter write) throws IOException {
        write = new FileWriter("arxiu.txt");
        PrintWriter pw = new PrintWriter(write);

        return write;
    }

    public static long Codi() throws FileNotFoundException {
        File arxiu = new File("arxiu.txt");
        FileOutputStream Fs = new FileOutputStream(arxiu);
        DataOutputStream Ds = new DataOutputStream(Fs);
        Scanner s = new Scanner(System.in);
        long Codi = 6;
        float codi_escrit;
        codi_escrit = 1234;
        return Codi;
    }

    public static String Nom() {
        String line = null;
        try {
            String file = "arxiu.txt";
            FileWriter fw = new FileWriter(file, true);
            line = "Paco ";
            fw.write(line);
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return line;
    }
    public static String Cognom() {
        String line = null;
        try {
            String file = "arxiu.txt";
            FileWriter fw = new FileWriter(file, true);
            line = "Fernandez ";
            fw.write(line);
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return line;
    }
    
    public static String Data_naix(){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date data = new Date("09/08/1999");
        String dateToStr = null;
        try {
            String file = "arxiu.txt";
            FileWriter fw = new FileWriter(file, true);
            dateToStr = dateFormat.format(data);
            fw.write(dateToStr);
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return dateToStr;
    }
    
    public static String Address(){
        String line = null;
        try {
            String file = "arxiu.txt";
            FileWriter fw = new FileWriter(file, true);
            line = "Carrer de Manuel Ballbé ";
            fw.write(line);
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return line;      
    }

    public static String Lector() throws IOException {
        int x = 13;
        String linea;
        FileReader fr = new FileReader("arxiu.txt");
        BufferedReader bf = new BufferedReader(fr);
        Scanner s = new Scanner(System.in);

        long numero_lin = 0;
        while ((linea = bf.readLine()) != null) {
            if (numero_lin == x) {
                System.out.println(linea);
                return linea;
            } else if (numero_lin > x) {
                linea = "El numero es massa gran";
            } else {
                numero_lin++;
            }
        }

        return linea;
    }
}
