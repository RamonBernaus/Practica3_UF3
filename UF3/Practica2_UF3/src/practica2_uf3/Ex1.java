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
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Ramon
 */
public class Ex1 {

    public static void main(String[] args) throws IOException, ParseException {
        Scanner s = new Scanner(System.in);
        int n, c, a;
        CrearFile();
        OmplirFile();
        System.out.println("Que vols fer? ");
        System.out.println("1. Consultar un client per posicio ");
        System.out.println("2. Consultar un client er codi ");
        System.out.println("3. Modificar un client ");
        System.out.println("4. Esborrarun client ");
        System.out.println("5. Llistat dels clients");
        c = s.nextInt();
        switch (c) {
            case 1:;
                System.out.println("Quina posicio vols consultar? (1, 2, 3, 4, 5 o 6)");
                n = s.nextInt();
                Posicio(n);
                break;
            case 2:
                System.out.println("Introdueix el codi del client ");
                int Codi = s.nextInt();
                ConsultarCodi(Codi);
                break;
            case 3:
                System.out.println("Quin client vols modificar? ");
                a = s.nextInt();
                switch (a) {
                    case 1:
                        System.out.println("Quin factor del " + Client1 + " vols canviar? (1, 2, 3, 4, 5 o 6)");
                        int i = s.nextInt();
                        ModificarClient(i);
                        NouFile();
                        break;
                    case 2:
                        System.out.println("Quin factor del " + Client2 + " vols canviar? (1, 2, 3, 4, 5 o 6)");
                        int o = s.nextInt();
                        ModificarClient(o + 6);
                        NouFile();
                        break;
                    default:
                        break;
                }
            case 4:
                System.out.println("Quin client vols borrar?");
                int e = s.nextInt();
                BorrarClient(e);
                break;
            case 5:
                System.out.println(Client1);
                System.out.println(Client2);
                break;
            default:
                break;
        }
    }
    static int Codi1 = 123456,
            Codi2 = 234567;
    static String nom1 = " Paco ";
    static String nom2 = " Pol ";
    static String Cognom1 = " Fernandez ",
            Cognom2 = " Garcia ";
    static Date Data1 = new Date(" 19/05/1999 "),
            Data2 = new Date(" 15/08/2002 ");
    static String Address1 = " Carrer de Manuel Ballbé, 5, Barcelona ",
            Address2 = " Carrer de Manuel Ballbé, 7, Barcelona ";
    static String Email1 = " pacofernandez@gmail.com ",
            Email2 = " polgarcia@gmail.com ";
    static String Client1 = Codi(Codi1) + Nom(nom1) + Cognom(Cognom1) + Data_naix(Data1) + Address(Address1) + Email(Email1),
            Client2 = Codi(Codi2) + Nom(nom2) + Cognom(Cognom2) + Data_naix(Data2) + Address(Address2) + Email(Email2);

    public static File CrearFile() throws IOException {
        File arxiu = new File("./arxiu.txt");
        arxiu.createNewFile();
        return arxiu;
    }

    public static FileWriter OmplirFile() {
        FileWriter write = null;
        PrintWriter pw = null;
        try {
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy ");
            write = new FileWriter("arxiu.txt");
            pw = new PrintWriter(write);
            pw.println("1 " + Client1);
            pw.println("2 " + Client2);
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

    public static int Codi(int Codi) {
        File arxiu = new File("arxiu.txt");
        String file = "arxiu.txt";
        while (Codi < 999999) {
            return Codi;
        }
        return 0;
    }

    public static String Nom(String nom) {
        try {
            String file = "arxiu.txt";
            FileWriter fw = new FileWriter(file, true);
            fw.write(nom);
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return nom;
    }

    public static String Cognom(String Cognom) {
        try {
            String file = "arxiu.txt";
            FileWriter fw = new FileWriter(file, true);
            fw.write(Cognom);
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return Cognom;
    }

    public static String Data_naix(Date data) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy ");
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

    public static String Address(String Address) {
        try {
            String file = "arxiu.txt";
            FileWriter fw = new FileWriter(file, true);
            fw.write(Address);
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return Address;
    }

    public static String Email(String Email) {
        try {
            String file = "arxiu.txt";
            FileWriter fw = new FileWriter(file, true);
            fw.write(Email);
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return Email;
    }

    public static String ClientPosicio() throws IOException {
        int x = 0;
        String linea;
        File arxiu = new File("arxiu.txt");
        FileReader fr = new FileReader("arxiu.txt");
        BufferedReader bf = new BufferedReader(fr);
        long numero_lin = 0;
        while ((linea = bf.readLine()) != null) {
            if (numero_lin == x) {
                System.out.println(linea);
            } else {
                numero_lin++;
            }
        }
        return linea;
    }

    public static int Posicio(int n) throws IOException {
        Scanner s = new Scanner(System.in);
        while (n < 0 || n > 6) {
            System.out.println("El numero que has donat no esta entre 1 i 6");
            System.out.println("Torna a probar-ho");
            n = s.nextInt();
        }
        switch (n) {
            case 1:
                System.out.println("El codi del client es " + Codi(Codi1));
                System.out.println("El codi del client es " + Codi(Codi2));
                break;
            case 2:
                System.out.println("El nom del client es " + Nom(nom1));
                System.out.println("El nom del client es " + Nom(nom2));
                break;
            case 3:
                System.out.println("El cognom del client es " + Cognom(Cognom1));
                System.out.println("El cognom del client es " + Cognom(Cognom2));
                break;
            case 4:
                System.out.println("la data de naixement del client es " + Data_naix(Data1));
                System.out.println("la data de naixement del client es " + Data_naix(Data2));
                break;
            case 5:
                System.out.println("l'Adreça del client es " + Address(Address1));
                System.out.println("l'Adreça del client es " + Address(Address2));
                break;
            case 6:
                System.out.println("El email del client es " + Email(Email1));
                System.out.println("El email del client es " + Email(Email2));
                break;
            default:
                break;
        }
        return n;
    }

    public static int ConsultarCodi(int a) throws IOException {
        final int cod1 = 123456, cod2 = 234567;
        switch (a) {
            case cod1:
                a = Codi1;
                System.out.println("El client amb aquest codi es " + Client1);
                break;
            case cod2:
                a = Codi2;
                System.out.println("El client amb aquest codi es " + Client2);
                break;
            default:
                break;
        }

        return a;
    }

    public static String ModificarClient(int n) throws ParseException {
        Scanner s = new Scanner(System.in);
        switch (n) {
            case 1:
                ModificarCodi(1);
            case 2:
                System.out.println("Introdueix el nou nom");
                String nom = s.nextLine();
                nom1 = nom;
                return nom1;
            case 3:
                System.out.println("Introdueix el nou cognom");
                String cognom = s.nextLine();
                Cognom1 = cognom;
                return Cognom1;
            case 4:
                ModificarData(1);
            case 5:
                System.out.println("Introdueix la nova adreça ");
                String adres = s.nextLine();
                Address1 = adres;
                return Address1;
            case 6:
                System.out.println("Introdueix el nou email ");
                String email = s.nextLine();
                Email1 = email;
                return Email1;
            case 7:
                ModificarCodi(2);
            case 8:
                System.out.println("Introdueix el nou nom");
                nom = s.nextLine();
                nom2 = nom;
                return nom2;
            case 9:
                System.out.println("Introdueix el nou cognom");
                String cognom2 = s.nextLine();
                Cognom2 = cognom2;
                return Cognom2;
            case 10:
                ModificarData(2);
            case 11:
                System.out.println("Introdueix la nova adreça ");
                String adres2 = s.nextLine();
                Address2 = adres2;
                return Address2;
            case 12:
                System.out.println("Introdueix el nou email ");
                String email2 = s.nextLine();
                Email2 = email2;
                return Email2;
            default:
                break;
        }
        return null;
    }

    public static int ModificarCodi(int m) {
        Scanner s = new Scanner(System.in);
        if (m == 1) {
            System.out.println("Introdueix el nou Codi");
            int cod = s.nextInt();
            Codi1 = cod;
            return Codi1;
        } else if (m == 2) {
            System.out.println("Introdueix el nou Codi");
            int cod = s.nextInt();
            Codi2 = cod;
            return Codi2;
        }
        return 0;
    }

    public static Date ModificarData(int m) throws ParseException {
        Scanner s = new Scanner(System.in);
        if (m == 1) {
            System.out.println("Introdueix la nova data ");
            String DataComText = s.nextLine();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date data = sdf.parse(DataComText);
            return data;
        } else if (m == 2) {
            System.out.println("Introdueix la nova data ");
            String DataComText = s.nextLine();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date data1 = sdf.parse(DataComText);
            return data1;
        }
        return null;
    }

    public static FileWriter NouFile() {
        FileWriter write2 = null;
        PrintWriter pw = null;
        try {
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy ");
            write2 = new FileWriter("arxiu.txt");
            pw = new PrintWriter(write2);
            pw.println(" " + Client1);
            pw.println(" " + Client2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if (null != write2) {
                write2.close();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return write2;
    }

    public static FileWriter BorrarClient(int c) {
        switch (c) {
            case 1:
                FileWriter writec = null;
                PrintWriter pwc = null;
                try {
                    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy ");
                    writec = new FileWriter("arxiu.txt");
                    pwc = new PrintWriter(writec);
                    pwc.println(" " + Client2);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                try {
                    if (null != writec) {
                        writec.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                return writec;
            case 2:
                FileWriter writec2 = null;
                PrintWriter pwc2 = null;
                try {
                    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy ");
                    writec2 = new FileWriter("arxiu.txt");
                    pwc2 = new PrintWriter(writec2);
                    pwc2.println(" " + Client1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                try {
                    if (null != writec2) {
                        writec2.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                return writec2;
        }
        return null;
    }
    public static String LlistaClients(){
        String a; 
        System.out.println(a = Client1);
        System.out.println(a = Client2);
        return a;
    }
}
