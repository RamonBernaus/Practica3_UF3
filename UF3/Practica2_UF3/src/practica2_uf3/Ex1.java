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
        Codi();
        Nom();
        Cognom();
        Data_naix();
        Address();
        Email();

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
            pw.println("1 " + Codi());
            pw.println("2 " + Nom());
            pw.println("3 " + Cognom());
            pw.println("4 " + Data_naix());
            pw.println("5 " + Address());
            pw.println("6 " + Email());

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

    public static int Codi() throws FileNotFoundException, IOException {
        File arxiu = new File("arxiu.txt");
        String file = "arxiu.txt";
        FileWriter fw = new FileWriter(file, true);
        int Codi = 123456;
        if (Codi < 999999) {
            return Codi;
        } else {
            return 0;
        }
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

    public static String Data_naix() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy ");
        Date data = new Date("09/08/1999 ");
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

    public static String Address() {
        String line = null;
        try {
            String file = "arxiu.txt";
            FileWriter fw = new FileWriter(file, true);
            line = "Carrer de Manuel Ballbé, 5, Barcelona ";
            fw.write(line);
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return line;
    }

    public static String Email() {
        String line = null;
        try {
            String file = "arxiu.txt";
            FileWriter fw = new FileWriter(file, true);
            line = "pacofernandez@gmail.com ";
            fw.write(line);
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return line;
    }

    public static String Lector() throws IOException {
        int x = 1;
        String linea = "paco";
        File arxiu = new File("arxiu.txt");
        FileReader fr = new FileReader("arxiu.txt");
        BufferedReader bf = new BufferedReader(fr);
        FileWriter fw = new FileWriter(arxiu, true);

        long numero_lin = 0;
        while ((linea = bf.readLine()) != null) {
            if (numero_lin == x) {
                fw.write(linea);
                fw.close();
                return linea;
            } else {
                numero_lin++;
            }
        }

        return linea;
    }
}
